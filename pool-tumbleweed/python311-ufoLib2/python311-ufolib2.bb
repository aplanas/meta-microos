SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python311-ufoLib2-0.13.1-1.5.noarch.rpm"
RPM_HASH = "6ad7796fd0e7de52f2bcaffb20a1075d2221f4b7e25275d65a8cf6dbe0a4a2d296625f1de761ffc0e873d0b274a902eb926976ecdb195d28676fb7e06b72a87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoLib2 \
python3.11dist-ufolib2 \
python311-ufoLib2 \
python3dist-ufolib2"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-attrs \
python311-fs"

inherit rpm
