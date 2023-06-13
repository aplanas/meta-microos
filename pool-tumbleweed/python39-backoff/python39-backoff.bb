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

RPM_NAME = "python39-backoff-2.2.1-2.1.noarch.rpm"
RPM_HASH = "3c8dfb20d38c65a8c46d5b7e1b54b1539f1a21b8d2282a9c07e840ab3a2e75c363a7882cc8d37fed7c80a16b4f5bd7376a3cd180ae2097859f6694d2ba591a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(backoff) \
python39-backoff \
python3dist(backoff)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
