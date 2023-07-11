SUMMARY = "Oauth2 plugin for the Single Sign On Framework"
DESCRIPTION = "This package contains the Oauth2 plugin for the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25"

RPM_NAME = "signon-plugin-oauth2-0.25-1.12.aarch64.rpm"
RPM_HASH = "4642805496b792610b0329ef2707731b0571230dacd415b45df2e222b814f53683b05f3d8796ad4cfae67fa5d7ae2777dd23d9a029eb5dde3ffdf6522b77f8f9"

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
