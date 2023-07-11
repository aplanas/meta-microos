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

RPM_NAME = "python310-backoff-2.2.1-2.3.noarch.rpm"
RPM_HASH = "bc184472dec1f2b046a3b85d4c1b2e606e058e836553ac49f8ef163c54ccbb0f000d5709080636b934f7bd54cf802cb024ce09a967ce1cfaa7712f2bfb0a0bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-backoff \
python310-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
