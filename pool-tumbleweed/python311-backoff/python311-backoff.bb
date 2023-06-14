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

RPM_NAME = "python311-backoff-2.2.1-2.1.noarch.rpm"
RPM_HASH = "4133a9a5510fa28f4b2b5648ba28fde1de9ce50dbcda773acc019e98c3818862aa77098dabfc33bbcbdfc7da3b5540e949982398c431d082e8f3db57cce650ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-backoff \
python311-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
