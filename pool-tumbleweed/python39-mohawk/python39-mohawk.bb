SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python39-mohawk-1.1.0-5.4.noarch.rpm"
RPM_HASH = "213cc7be0001445cffa598b62cbbd915445a8ce06d4496b66146b5d79bf74980b08e2d727a6664d72c5a9fe1e6cefeb7c3ed326a517ad9b8883836a8256a7c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mohawk) \
python39-mohawk \
python3dist(mohawk)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
