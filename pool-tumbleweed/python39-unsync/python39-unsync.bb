SUMMARY = "Unsynchronize asyncio"
DESCRIPTION = " \
Unsynchronize `asyncio` by using an ambient event loop in a separate thread. \
 \
 \
1. Mark all async functions with `@unsync`. May also mark regular \
   functions to execute in a separate thread. \
    * All `@unsync` functions, async or not, return an `Unfuture` \
2. All `Futures` must be `Unfutures` which includes the result of an \
   `@unsync` function call, or wrapping `Unfuture(asyncio.Future)` or \
   `Unfuture(concurrent.Future)`. `Unfuture` combines the behavior of \
   `asyncio.Future` and `concurrent.Future`: \
   * `Unfuture.set_value` is threadsafe unlike `asyncio.Future` \
   * `Unfuture` instances can be awaited, even if made from \
     `concurrent.Future` \
   * `Unfuture.result()` is a blocking operation *except* in \
     `unsync.loop`/`unsync.thread` where it behaves like \
     `asyncio.Future.result` and will throw an exception if the future \
     is not done \
3. Functions will execute in different contexts: \
   * `@unsync` async functions will execute in an event loop in \
     `unsync.thread` \
   * `@unsync` regular functions will execute in \
     `unsync.thread_executor`, a `ThreadPoolExecutor` \
   * `@unsync(cpu_bound=True)` regular functions will execute in \
     `unsync.process_executor`, a `ProcessPoolExecutor`"
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python39-unsync-1.3-1.12.noarch.rpm"
RPM_HASH = "6d6ec1c79a7f9ad1ced261796411a6c42324b8f2236ed248037d2ae333e0a02ca196b1301908e97b7d8d5d38b15643110a5541b4a3ce1135ebd2c5d83c26bc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unsync \
python39-unsync \
python3dist-unsync"

RDEPENDS:${PN} += "python-abi"

inherit rpm
