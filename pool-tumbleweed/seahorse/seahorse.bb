SUMMARY = "GNOME interface for gnupg"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "seahorse-43.0-3.6.aarch64.rpm"
RPM_HASH = "9fa5e847080bb6ce1cdce8aed6140bf96a6870b1d314c79fc2c1b40191e6590a6d502252e4f6607875ab068ec2c4015bfef5518d82206391f8a4aeb4dbd7eb94"

RPROVIDES:${PN} += "seahorse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libldap.so.2 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsoup-3.0.so.0"

inherit rpm
