SUMMARY = "Mozilla Firefox Web Browser"
DESCRIPTION = "Mozilla Firefox is a standalone web browser, designed for standards \
compliance and performance.  Its functionality can be enhanced via a \
plethora of extensions."
LICENSE = "MPL-2.0"

PV = "115.0.2"

RPM_NAME = "MozillaFirefox-115.0.2-1.1.aarch64.rpm"
RPM_HASH = "ec4e1da0ff60732d87788c6a655aa3772115fde6b3f37085e5594112e564f2f62800a179341914cf3619df6059c49d5662d9c99028d8ab78aa1cf8bc1fb6a03a"

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
