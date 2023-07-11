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

RPM_NAME = "python311-backoff-2.2.1-2.3.noarch.rpm"
RPM_HASH = "f0bc2131acaffcfd1024c07af1364a4b4dc0c453860ec2eb1ed117cbd16cb5ce2f0e6c00649379371b9546f8626f99e99b84cd4d7a5f96567fe093bde1475a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backoff \
python3.11dist-backoff \
python311-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
