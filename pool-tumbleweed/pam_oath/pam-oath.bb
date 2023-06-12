SUMMARY = "PAM module for pluggable login authentication for OATH"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains a module to integrate OATH into PAM."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7"

RPM_NAME = "pam_oath-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "dfd6bc43c547523436c188b686363474474ad6a3471bd30cbdd0a5a26aaec78c2e3b56f2bc8181ac7ecfaa74eaaf948148f82612533594dd5e14324ae1602926"

RPROVIDES:${PN} += "pam_oath \
pam_oath(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liboath.so.0()(64bit) \
liboath.so.0(LIBOATH_1.2.0)(64bit) \
liboath.so.0(LIBOATH_1.8.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit)"

inherit rpm
