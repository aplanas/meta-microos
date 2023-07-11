SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-ufoLib2-0.13.1-1.5.noarch.rpm"
RPM_HASH = "1017ea1d4e78af038111195599bd45ed64f96747bceec7c55f77770361c9fc3b7857cd4e0ed22b482edf632fe07283eb39aa35c449cd72042f5e59c7e5859967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ufolib2 \
python310-ufoLib2 \
python3dist-ufolib2"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-attrs \
python310-fs"

inherit rpm
