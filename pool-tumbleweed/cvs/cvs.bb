SUMMARY = "Concurrent Versions System"
DESCRIPTION = "CVS is a front-end to the rcs (Revision Control System) included in the \
standard Linux distributions. PCL-CVS, an emacs (Emacs) front-end for \
CVS, is also included."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-1.12.13-2.8.aarch64.rpm"
RPM_HASH = "fa0a349e72830dcb48baec4bad7b04877f205044e96f1316d38a85e75048cd92c815e122b384959c01337ef8b1a95f85247a085880dfb27babce7609df34887f"

RPROVIDES:${PN} += "config-cvs \
cvs"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/mktemp \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libz.so.1 \
openssh"

inherit rpm
