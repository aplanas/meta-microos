SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python310-libarchive-c-4.0-2.7.noarch.rpm"
RPM_HASH = "43a9682737353ae91810b0982036da5f5c65d7effde7c74dcaa0dd9c26362a4979b29d8adc658ae82dfac6771714d5fae4276f7272ced71bcb37e51c22a20655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libarchive-c \
python310-libarchive-c \
python3dist-libarchive-c"

RDEPENDS:${PN} += "libarchive13 \
python-abi"

inherit rpm
