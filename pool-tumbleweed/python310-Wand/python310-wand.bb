SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python310-Wand-0.6.11-1.3.noarch.rpm"
RPM_HASH = "376992b8c7fbe6728e44ac475f60c129c51dfb1a6869ea160d5a4b8e648ecbc01c59536b31e67e0e4a6667f40d8bbd147eed794ff9d037fa9201014eeb74df70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Wand \
python3.10dist-wand \
python310-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
