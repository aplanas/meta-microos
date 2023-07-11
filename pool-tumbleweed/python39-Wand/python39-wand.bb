SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python39-Wand-0.6.11-1.5.noarch.rpm"
RPM_HASH = "63383c7097c416e68c6b75632ab0ad74327a937dc8c13ea974d5caab53077d11839814879d569a391c532486148615f873cdf144bbdf1eb98e9d282ebcd52534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wand \
python39-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
