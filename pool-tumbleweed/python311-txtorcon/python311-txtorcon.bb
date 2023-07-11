SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python311-txtorcon-22.0.0-2.6.noarch.rpm"
RPM_HASH = "e5352d5d09a0d7dfde09011461cdd948aefeacc548211173b1eac3456582305acede13c44458ad2d6940420b6cf9c9a246e56204063e50a61cd6bf5f12b46b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txtorcon \
python3.11dist-txtorcon \
python311-txtorcon \
python3dist-txtorcon"

RDEPENDS:${PN} += "python-abi \
python311-Automat \
python311-Twisted-tls \
python311-incremental \
python311-zope.interface"

inherit rpm
