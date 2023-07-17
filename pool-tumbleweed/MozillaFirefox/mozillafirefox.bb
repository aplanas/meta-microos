SUMMARY = "Mozilla Firefox Web Browser"
DESCRIPTION = "Mozilla Firefox is a standalone web browser, designed for standards \
compliance and performance.  Its functionality can be enhanced via a \
plethora of extensions."
LICENSE = "MPL-2.0"

PV = "115.0.1"

RPM_NAME = "MozillaFirefox-115.0.1-1.1.aarch64.rpm"
RPM_HASH = "d3b9dfa89c37ed875d00ec37d2f357fe2d23866ccc8a2714dc5359f7c5f949427e4265dc754a96d695aef4e2d445fd9a510efa682d677e9a083b4cd364e3c906"

RPROVIDES:${PN} += "MozillaFirefox \
appdata- \
appdata-firefox.appdata.xml \
firefox \
mozilla-kde4-version \
web-browser"

RDEPENDS:${PN} += "/usr/bin/sh \
MozillaFirefox-branding \
coreutils \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libasound.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfreetype6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpango-1.0.so.0 \
libplc4.so \
libproxy.so.1 \
libsmime3.so \
libssl3.so \
libstdc++.so.6 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1 \
mozilla-nspr \
mozilla-nss \
shared-mime-info"

inherit rpm
