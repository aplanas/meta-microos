SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-arabic-reshaper-3.0.0-1.5.noarch.rpm"
RPM_HASH = "9911a34b26bcb047a9bbd5293990446183cac46476a49fc28c04d1f9de32ebfc614be2b282b188f35ba28be4ad188892980110de8ed4cc63691667f070b9ddef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arabic-reshaper \
python3.11dist-arabic-reshaper \
python311-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
