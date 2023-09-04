SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python310-Wand-0.6.11-2.1.noarch.rpm"
RPM_HASH = "bba3da44821ecfb7ac6a56506f1070f46e87a306853d3dcc254ac1935e5f34803d63559a31fbb40229cc3c61c11c662282c643fbc2e91e504423a3ef3fce6287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wand \
python310-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
