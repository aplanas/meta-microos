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

RPM_NAME = "python39-backoff-2.2.1-2.3.noarch.rpm"
RPM_HASH = "ad2e77b19604c93e0ea8d55341ead3ec3b501f61bf0e20632360122b2bd734edf7f020d9517be02b7146611e98c9ebf01705442baefb9a5b67d32fc535be307e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-backoff \
python39-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
