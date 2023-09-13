SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-uc-micro-py-1.0.2-1.1.noarch.rpm"
RPM_HASH = "dcb1e06dace9a5851043adabe7ea5ca4a81093e0ec8fab20d5180bb8ededf3739e85e5ba511534e34f151c695be16b5fb8578c6c27fe0ab4685333dfc39c9552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uc-micro-py \
python39-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
