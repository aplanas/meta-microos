SUMMARY = "Simple GTK+ client for managing TOTP and HOTP"
DESCRIPTION = "Highly secure and easy to use GTK+ software for two-factor authentication \
that supports both Time-based One-time Passwords (TOTP) and \
HMAC-Based One-Time Passwords (HOTP)."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.7"

RPM_NAME = "otpclient-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "6d976f761fbc04289ce10ec1d3ab691756258d1c6800da3b3a93f90be124db4831347a0e1f55781d05212a01e19bab67dac011ded6ea58e93801978e8280eb3b"

RPROVIDES:${PN} += "otpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcotp.so.2 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libpng16.so.16 \
libprotobuf-c.so.1 \
libqrencode.so.4 \
libsecret-1.so.0 \
libuuid.so.1 \
libzbar.so.0"

inherit rpm
