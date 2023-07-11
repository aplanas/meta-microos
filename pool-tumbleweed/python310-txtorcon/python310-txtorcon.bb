SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python310-txtorcon-22.0.0-2.6.noarch.rpm"
RPM_HASH = "28dc7d39662dd285d6c3631841468fdea306d5df246d344a1e14c7f5e06ce9c3a67b38bd3360562955e45e0d1f5937fbf75cf886856f00be2e890130e59e560a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txtorcon \
python310-txtorcon \
python3dist-txtorcon"

RDEPENDS:${PN} += "python-abi \
python310-Automat \
python310-Twisted-tls \
python310-incremental \
python310-zope.interface"

inherit rpm
