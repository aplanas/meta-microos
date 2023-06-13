SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python310-txtorcon-22.0.0-2.4.noarch.rpm"
RPM_HASH = "6c604d12808a8b937aec3277af34d5b2ed811be5c435a8ac6297b53f665e75ebaf3904c1d4ddbb8c078eea2c2d9ce4bd59a98857be83db52d6b809b59bd05c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txtorcon \
python3.10dist(txtorcon) \
python310-txtorcon \
python3dist(txtorcon)"

RDEPENDS:${PN} += "python(abi) \
python310-Automat \
python310-Twisted-tls \
python310-incremental \
python310-zope.interface"

inherit rpm
