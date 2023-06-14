SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "python39-txtorcon-22.0.0-2.4.noarch.rpm"
RPM_HASH = "af2aa3ce2a403c2f9c21fc69629d74ee8ac3a3a2f98a750d550d655ae6dc19184045b1b35fb772f5af74e39487393e0acdfcb9f01372b345e7ba53d690157d6d"
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
