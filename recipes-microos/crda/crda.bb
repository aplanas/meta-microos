SUMMARY = "802.11 central regulatory domain agent"
DESCRIPTION = "The crda binary provides access to the wireless-regdb to the kernel \
through udev."
LICENSE = "SUSE-Copyleft-Next-0.3.0"

PV = "4.14"

RPM_NAME = "crda-4.14-2.2.aarch64.rpm"
RPM_HASH = "3554d239304e3f2448d663880180c381a8766b0d710123dfc6425f932a89b94fccc2057eb400230b7e9c420fe65951685a463397190f4079fedaaf1fed9c4226"

RPROVIDES:${PN} += "crda crda(aarch-64) libreg.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libm.so.6()(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) wireless-regdb"

inherit rpm
