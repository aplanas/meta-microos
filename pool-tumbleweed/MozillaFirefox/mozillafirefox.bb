SUMMARY = "Mozilla Firefox Web Browser"
DESCRIPTION = "Mozilla Firefox is a standalone web browser, designed for standards \
compliance and performance.  Its functionality can be enhanced via a \
plethora of extensions."
LICENSE = "MPL-2.0"

PV = "113.0.2"

RPM_NAME = "MozillaFirefox-113.0.2-1.1.aarch64.rpm"
RPM_HASH = "42795804011221a76564964147902b677926e5039d144b5b146c5ee24990d2d87d00fe133663a5e372f869b89d610fe55f0ace5326a627a4c29657e2c99ec17a"

RPROVIDES:${PN} += "MozillaFirefox \
MozillaFirefox(aarch-64) \
appdata() \
appdata(firefox.appdata.xml) \
application() \
application(firefox.desktop) \
firefox \
metainfo() \
metainfo(firefox.appdata.xml) \
mimehandler(application/vnd.mozilla.xul+xml) \
mimehandler(application/x-xpinstall) \
mimehandler(application/xhtml+xml) \
mimehandler(text/html) \
mimehandler(text/mml) \
mimehandler(text/xml) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https) \
mozilla-kde4-version \
web_browser"

RDEPENDS:${PN} += "/bin/sh \
MozillaFirefox-branding \
coreutils \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfreetype6 \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libpango-1.0.so.0()(64bit) \
libplc4.so()(64bit) \
libproxy.so.1()(64bit) \
libsmime3.so()(64bit) \
libssl3.so()(64bit) \
libstdc++.so.6()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
mozilla-nspr \
mozilla-nss \
shared-mime-info"

inherit rpm
