SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python39-Wand-0.6.11-1.3.noarch.rpm"
RPM_HASH = "a185642c6e81c2a965cc1dd2d84f8366c6efb065fe492901360f8a90afff1d94d1f79dc3bdc504d0316c344e7aab1a4af33843e348f9dda332317c9e10d20269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wand) \
python39-Wand \
python3dist(wand)"
RDEPENDS:${PN} += "ImageMagick \
python(abi)"

inherit rpm
