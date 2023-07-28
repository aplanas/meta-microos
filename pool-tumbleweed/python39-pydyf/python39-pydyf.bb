SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-pydyf-0.7.0-1.1.noarch.rpm"
RPM_HASH = "a07856bf36534259f8864c8b780c3c8fcfb45e3ef77a0b8aff4da9513317b0f461a0baec28cd8999a5c83087c54d7eb5a927ba43672c1573ef91202608afe80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydyf \
python39-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
