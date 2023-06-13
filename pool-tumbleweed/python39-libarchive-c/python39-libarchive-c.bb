SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python39-libarchive-c-4.0-2.5.noarch.rpm"
RPM_HASH = "dd7e458e8588760036092c22738be76271faa7b0aa5c09ee51d8c211d08316de31ce54cba24a146adbdc6a284462e184b983158ab47348dd3c8a1669766e3d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(libarchive-c) \
python39-libarchive-c \
python3dist(libarchive-c)"

RDEPENDS:${PN} += "libarchive13 \
python(abi)"

inherit rpm
