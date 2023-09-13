SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-uc-micro-py-1.0.2-1.1.noarch.rpm"
RPM_HASH = "68e9e77421410c5217a1aa48a03ddaa7836cb6fa10f96f6b7905adebece789a7cbcf685ea6b29a4540a15653b24b8dd1c0966e2621a41ffdbe35e0383889f3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uc-micro-py \
python3.11dist-uc-micro-py \
python311-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
