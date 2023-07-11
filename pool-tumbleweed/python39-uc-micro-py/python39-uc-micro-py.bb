SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-uc-micro-py-1.0.1-2.3.noarch.rpm"
RPM_HASH = "989e967d3f7c5d71c0fb62a585b23ca25cdd368704690c13eab6356289eed83ab9dc3ba216b4baedaa691f1b1d9958ba37a2c5b87a4e9648f06793a3ad37e614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uc-micro-py \
python39-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
