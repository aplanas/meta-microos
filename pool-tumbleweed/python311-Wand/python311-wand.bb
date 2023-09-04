SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python311-Wand-0.6.11-2.1.noarch.rpm"
RPM_HASH = "b13b684f0229b4816b3cbbdd92624d995a3c33b37cd80f604f7046c2e2a141e72505c46df9d8143771d8def2e6bfed466c0a973c9b4b6f7afa7924731ff4c083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Wand \
python3.11dist-wand \
python311-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
