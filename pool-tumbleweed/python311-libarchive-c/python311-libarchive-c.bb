SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python311-libarchive-c-4.0-2.7.noarch.rpm"
RPM_HASH = "2d4c0ffaa320c7696fb91f8b73fd9a95066e4123b5fe79b61a34a8704bf44db4dcd81f32145ca21b63c79e7abd6f1342ccfe742d3269f817b631a82f4711822a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive-c \
python3.11dist-libarchive-c \
python311-libarchive-c \
python3dist-libarchive-c"

RDEPENDS:${PN} += "libarchive13 \
python-abi"

inherit rpm
