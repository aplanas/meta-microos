SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python39-snuggs-1.4.7-2.7.noarch.rpm"
RPM_HASH = "e1240124a30af70d95db4d2f95977e144e6b65f2948ab43f9c4e4414f9317a87fa21edb9d50dbd104fb8e97c098e8e5623a9f2da269a5fbd8bd97c0ac3b60bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-snuggs \
python39-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pyparsing"

inherit rpm
