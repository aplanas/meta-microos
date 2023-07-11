SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python310-Wand-0.6.11-1.5.noarch.rpm"
RPM_HASH = "748332f92f8f5d8df72d481cba55cbd997c8c27d74e06ba30eeec290674356ae792f6257dc528a1b9af23fd4a61389e72588632c66c0bba61e044f8a68bf0b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wand \
python310-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
