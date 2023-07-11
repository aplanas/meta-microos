SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python39-libarchive-c-4.0-2.7.noarch.rpm"
RPM_HASH = "77a613a6ad6332346c4a1f48f0bc8f5eeda1c2bfe142a0f1838025325d9e96f72a3b4c3ec72a2627bb5e542c64acade0d255c5a5b1578a1a050b20e8024df0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libarchive-c \
python39-libarchive-c \
python3dist-libarchive-c"

RDEPENDS:${PN} += "libarchive13 \
python-abi"

inherit rpm
