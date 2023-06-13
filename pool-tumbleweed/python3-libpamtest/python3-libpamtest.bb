SUMMARY = "A python wrapper for libpamtest"
DESCRIPTION = "If you plan to develop python tests for a PAM module, you can use this \
library, which simplifies testing of modules. This subpackage includes \
the header files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python3-libpamtest-1.1.4-2.3.aarch64.rpm"
RPM_HASH = "538c595af7686293d16f4384b3f52b4ac04a9ca05bf88ab2e131338fdbdab875a7303efcc4973eb84987fe985f9e2df7e74b6effcf0f49a478db398aea39454e"

RPROVIDES:${PN} += "python3-libpamtest \
python3-libpamtest(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpamtest.so.0()(64bit) \
libpamtest0 \
libpython3.10.so.1.0()(64bit) \
pam_wrapper \
python(abi)"

inherit rpm
