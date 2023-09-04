SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python39-Wand-0.6.11-2.1.noarch.rpm"
RPM_HASH = "ebe45a79905df174c23d73aef574af0b4c0016ad3f393d0fde880b2b5d1914135ee477f584baa50b7da0b1f48b206b9cbe2173aa93d7808c816b074d5ebd3ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wand \
python39-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
