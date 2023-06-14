SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python310-flufl.bounce-4.0-3.3.noarch.rpm"
RPM_HASH = "19df06d9367878acafbd1754fd28101469c6586d5dae1601f74aa1197a085f8d261d268c29f1761e62e4dcbe6df6b1468efec3a2038bc1ae17fe7950782c6eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.bounce \
python3.10dist-flufl.bounce \
python310-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python310-atpublic \
python310-zope.interface"

inherit rpm
