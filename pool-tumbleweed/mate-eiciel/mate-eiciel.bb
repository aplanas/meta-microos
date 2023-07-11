SUMMARY = "ACL viewer and editor for MATE"
DESCRIPTION = "MATE eiciel is a Graphical editor for access control lists (ACLs) \
and extended attributes (xattr), either as an extension within \
Caja, or as a standalone utility."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-1.20.1-2.10.aarch64.rpm"
RPM_HASH = "93b96572a2b216ed9d77a85f0b1f6fbb50524ad161afab5bb5285fcdc57b36d4d1c030d770cde929532eb1df6169faeb7fb095512d0f94844e0971b8d7c2aaf0"

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
