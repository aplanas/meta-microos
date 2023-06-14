SUMMARY = "Oauth2 plugin for the Single Sign On Framework"
DESCRIPTION = "This package contains the Oauth2 plugin for the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25"

RPM_NAME = "signon-plugin-oauth2-0.25-1.11.aarch64.rpm"
RPM_HASH = "dd8214342829ca294b4c106c1677c58bc1340bb563c16aeb392bfac63060a572b9b9794633288b1bbba537d947107d59d858297f8d6fb348830e82604e31fb4b"

RPROVIDES:${PN} += "liboauth2plugin.so \
signon-plugin-oauth2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libsignon-plugins.so.1 \
libstdc++.so.6 \
signon-ui"

inherit rpm
