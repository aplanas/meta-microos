SUMMARY = "PAM module for pluggable login authentication for OATH"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains a module to integrate OATH into PAM."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.8"

RPM_NAME = "pam_oath-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "df1402be23a4dc298a4559450010c2d9c71b875ea885a09ae337ad83bcceb566f5db0895f92a65dcfec2934795e788379b5e20a07215c243cb29cb8580fb8701"

RPROVIDES:${PN} += "pam-oath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboath.so.0 \
libpam.so.0"

inherit rpm
