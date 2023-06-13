SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-utils-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "2f6bb2602f28259a9c288201816173948777965fcb0fd9e3f9548bff349690ef04140fee6cb8d74cce4ab29dd61077d9307f70e82a6801dca2ce8c3d234c1872"

RPROVIDES:${PN} += "dapl-debug-utils \
dapl-debug-utils(aarch-64)"

RDEPENDS:${PN} += "dapl-debug \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdat2.so.2()(64bit) \
libdat2.so.2(DAT_2.0)(64bit)"

inherit rpm
