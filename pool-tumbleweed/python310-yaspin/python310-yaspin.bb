SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-yaspin-0.18.0-1.14.noarch.rpm"
RPM_HASH = "ccd94d824c6848749fba683623c913809863a2bdd83f435dab74d3241070480244d2104935870b46db16a34157dab06b34bdbb57f5cc8c133f56581042831ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yaspin \
python310-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
