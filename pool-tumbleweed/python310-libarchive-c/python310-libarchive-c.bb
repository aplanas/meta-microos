SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python310-libarchive-c-4.0-2.5.noarch.rpm"
RPM_HASH = "94e3dcc51aba6813a6c29c4c5fa15c1589a4efedf7e8e8968f198b8218aa9f85ffcd94cab97ac40acd7925f095d508fbc41a2f5b5ae896ce250dff51f61862e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive-c \
python3.10dist(libarchive-c) \
python310-libarchive-c \
python3dist(libarchive-c)"

RDEPENDS:${PN} += "libarchive13 \
python(abi)"

inherit rpm
