SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python311-txtorcon-22.0.0-2.4.noarch.rpm"
RPM_HASH = "49c0c2dca7b5cdf8329b54a7861ecb54b858eb9524ac085a813c9b9de64cbd266c6aa3bc8cb39b8cc7839ce9d642d6f082972c05eadb3429c392f6d3a419eb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txtorcon) \
python311-txtorcon \
python3dist(txtorcon)"
RDEPENDS:${PN} += "python(abi) \
python311-Automat \
python311-Twisted-tls \
python311-incremental \
python311-zope.interface"

inherit rpm
