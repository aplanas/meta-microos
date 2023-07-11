SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python311-Wand-0.6.11-1.5.noarch.rpm"
RPM_HASH = "97cefba1f44b60fc77277941ea4ecfd4c29540240c9de6a06c2a2d52cf0a0d39f9cdd495dfdd147ffe39ec18f8c3ad3fed7f5590c9e188a0c010070730c921c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Wand \
python3.11dist-wand \
python311-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
