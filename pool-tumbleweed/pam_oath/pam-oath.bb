SUMMARY = "PAM module for pluggable login authentication for OATH"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains a module to integrate OATH into PAM."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7"

RPM_NAME = "pam_oath-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "dfd6bc43c547523436c188b686363474474ad6a3471bd30cbdd0a5a26aaec78c2e3b56f2bc8181ac7ecfaa74eaaf948148f82612533594dd5e14324ae1602926"

RPROVIDES:${PN} += "pam-oath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboath.so.0 \
libpam.so.0"

inherit rpm
