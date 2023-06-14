SUMMARY = "Function decoration for backoff and retry"
DESCRIPTION = "This module provides function decorators which can be used to wrap a \
function such that it will be retried until some condition is met. It \
is meant to be of use when accessing unreliable resources with the \
potential for intermittent failures i.e. network resources and external \
APIs. Somewhat more generally, it may also be of use for dynamically \
polling resources for externally generated content. \
 \
Decorators support both regular functions for synchronous code and \
`asyncio <https://docs.python.org/3/library/asyncio.html>`_'s coroutines \
for asynchronous code."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-backoff-2.2.1-2.1.noarch.rpm"
RPM_HASH = "b01ad56e61a83d24155dae54620cbe45182d5b6078390096567f60ef72e6f5962fb1ebdb4b5672f066514db73a362577bbd7dfa28b7c639dcd9cd8de29d09506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backoff \
python3.10dist-backoff \
python310-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
