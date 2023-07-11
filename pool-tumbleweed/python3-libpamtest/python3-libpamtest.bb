SUMMARY = "A python wrapper for libpamtest"
DESCRIPTION = "If you plan to develop python tests for a PAM module, you can use this \
library, which simplifies testing of modules. This subpackage includes \
the header files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python3-libpamtest-1.1.4-2.4.aarch64.rpm"
RPM_HASH = "8cac1752b5bb69992dfb64be12740deb5a35d1a82c95119f9427553d01e95904619d5fade0339ff3f2d8356bdf306d79b35f91297505f767675b83fce85bbfc0"

RPROVIDES:${PN} += "python3-libpamtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpamtest.so.0 \
libpamtest0 \
libpython3.11.so.1.0 \
pam-wrapper \
python-abi"

inherit rpm
