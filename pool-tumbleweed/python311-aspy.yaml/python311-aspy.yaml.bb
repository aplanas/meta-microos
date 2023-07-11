SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-aspy.yaml-1.3.0-2.10.noarch.rpm"
RPM_HASH = "e6de668c188d3aa9f545a87534c2540fc679f8dde37558faa6379ed6a7f136f91b490a1c934ede36debc8368d6446aa7cc83d6ce127375f1343e0ea022068b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspy.yaml \
python3.11dist-aspy.yaml \
python311-aspy.yaml \
python3dist-aspy.yaml"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
