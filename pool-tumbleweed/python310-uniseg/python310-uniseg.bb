SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python310-uniseg-0.7.2-1.4.noarch.rpm"
RPM_HASH = "78a0ce64d2b24048a9c7d34b98bc010413ffe325f42de0bb48782769cdacabe709be51e1f8fabac183b3f4cbe8a76a1a12ecaad44d0dfc121a24b261dcff2f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uniseg \
python310-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
