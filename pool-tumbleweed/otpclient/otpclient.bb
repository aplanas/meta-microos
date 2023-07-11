SUMMARY = "Simple GTK+ client for managing TOTP and HOTP"
DESCRIPTION = "Highly secure and easy to use GTK+ software for two-factor authentication \
that supports both Time-based One-time Passwords (TOTP) and \
HMAC-Based One-Time Passwords (HOTP)."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.9"

RPM_NAME = "otpclient-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "ccf6f78992f68ca8009e18a59ece97227a8bc7036cc8f23a6293549c1edfe43e6154491565ecf07d178cbeb1082fbac450835c0b20c4bd5009d67b345863460d"

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
