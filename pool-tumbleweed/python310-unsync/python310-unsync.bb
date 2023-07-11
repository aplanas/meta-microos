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

RPM_NAME = "python310-unsync-1.3-1.12.noarch.rpm"
RPM_HASH = "314a0bc79d849101e897f40aab2ba9be44812e092acb4633c66f6934e12eec9161aab8d5c3ec0d10a419985d7e90f664b2c00080ed51df47fdc2496c68bad053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unsync \
python310-unsync \
python3dist-unsync"

RDEPENDS:${PN} += "python-abi"

inherit rpm
