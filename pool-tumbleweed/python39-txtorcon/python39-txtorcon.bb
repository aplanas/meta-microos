SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python39-txtorcon-22.0.0-2.6.noarch.rpm"
RPM_HASH = "4b5b8a52d5be17f73798935597d0aacbe5062f6decf7d7516cd6c3ba113ca0a12704cc27c5259974ca7ed7a3dd06656fcb8d1938e2c0832899f4f650c39f27c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txtorcon \
python39-txtorcon \
python3dist-txtorcon"

RDEPENDS:${PN} += "python-abi \
python39-Automat \
python39-Twisted-tls \
python39-incremental \
python39-zope.interface"

inherit rpm
