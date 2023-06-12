SUMMARY = "Oauth2 plugin for the Single Sign On Framework"
DESCRIPTION = "This package contains the Oauth2 plugin for the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25"

RPM_NAME = "signon-plugin-oauth2-0.25-1.11.aarch64.rpm"
RPM_HASH = "dd8214342829ca294b4c106c1677c58bc1340bb563c16aeb392bfac63060a572b9b9794633288b1bbba537d947107d59d858297f8d6fb348830e82604e31fb4b"

RPROVIDES:${PN} += "liboauth2plugin.so()(64bit) \
signon-plugin-oauth2 \
signon-plugin-oauth2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsignon-plugins.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
signon-ui"

inherit rpm