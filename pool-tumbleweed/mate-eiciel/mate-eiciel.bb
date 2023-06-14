SUMMARY = "ACL viewer and editor for MATE"
DESCRIPTION = "MATE eiciel is a Graphical editor for access control lists (ACLs) \
and extended attributes (xattr), either as an extension within \
Caja, or as a standalone utility."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-1.20.1-2.9.aarch64.rpm"
RPM_HASH = "bd1d36b58d75d595b2cbccbac6266d76af6d7899025c23502d9775586470eb411ac0c135a726a0356d7db2014a667fd29e8e501831fca596c393c43be626ca5a"

RPROVIDES:${PN} += "mate-eiciel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
