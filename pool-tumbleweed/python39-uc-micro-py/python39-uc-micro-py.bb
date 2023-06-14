SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-uc-micro-py-1.0.1-2.1.noarch.rpm"
RPM_HASH = "c2f5ccb90a3b4292428699c19153d072e9da4da0dec3140b184654ce649f0ac66cc5bc14eb5ea574ffac23aba9beef5a39c32c159352b2abef1b1b239cd2d510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uc-micro-py \
python39-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
