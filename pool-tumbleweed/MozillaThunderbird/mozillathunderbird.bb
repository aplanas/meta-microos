SUMMARY = "An integrated email, news feeds, chat, and newsgroups client"
DESCRIPTION = "Thunderbird is a free, open-source, cross-platform application for \
managing email, news feeds, chat, and news groups. It is a local \
(rather than browser- or web-based) email application that is powerful \
yet easy to use."
LICENSE = "MPL-2.0"

PV = "102.11.2"

RPM_NAME = "MozillaThunderbird-102.11.2-1.1.aarch64.rpm"
RPM_HASH = "d575526cf98a69257db88da34bf99c7d147bbf57e0617feabfce2a74fa3f609ec417efad1983bc85c7f3af91d9cbda4095725cb27862f9ff7a88ae32f6647db9"

RPROVIDES:${PN} += "MozillaThunderbird \
MozillaThunderbird(aarch-64) \
MozillaThunderbird-devel \
appdata() \
appdata(thunderbird.appdata.xml) \
application() \
application(thunderbird.desktop) \
metainfo() \
metainfo(thunderbird.appdata.xml) \
mimehandler(x-scheme-handler/mailto) \
mozilla-kde4-version \
thunderbird"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
desktop-file-utils \
fileutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfreetype6 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.10)(64bit) \
libnss3.so(NSS_3.10.2)(64bit) \
libnss3.so(NSS_3.11)(64bit) \
libnss3.so(NSS_3.11.2)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.3)(64bit) \
libnss3.so(NSS_3.12.4)(64bit) \
libnss3.so(NSS_3.12.5)(64bit) \
libnss3.so(NSS_3.12.9)(64bit) \
libnss3.so(NSS_3.13)(64bit) \
libnss3.so(NSS_3.13.2)(64bit) \
libnss3.so(NSS_3.15)(64bit) \
libnss3.so(NSS_3.16.1)(64bit) \
libnss3.so(NSS_3.16.2)(64bit) \
libnss3.so(NSS_3.19)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.21)(64bit) \
libnss3.so(NSS_3.22)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.30)(64bit) \
libnss3.so(NSS_3.31)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.43)(64bit) \
libnss3.so(NSS_3.44)(64bit) \
libnss3.so(NSS_3.45)(64bit) \
libnss3.so(NSS_3.47)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.52)(64bit) \
libnss3.so(NSS_3.55)(64bit) \
libnss3.so(NSS_3.58)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.79)(64bit) \
libnss3.so(NSS_3.8)(64bit) \
libnss3.so(NSS_3.9)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12)(64bit) \
libnssutil3.so(NSSUTIL_3.12.3)(64bit) \
libnssutil3.so(NSSUTIL_3.12.5)(64bit) \
libnssutil3.so(NSSUTIL_3.13)(64bit) \
libpango-1.0.so.0()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.13)(64bit) \
libsmime3.so(NSS_3.16)(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsmime3.so(NSS_3.4.1)(64bit) \
libsmime3.so(NSS_3.6)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.13)(64bit) \
libssl3.so(NSS_3.13.2)(64bit) \
libssl3.so(NSS_3.14)(64bit) \
libssl3.so(NSS_3.15)(64bit) \
libssl3.so(NSS_3.15.4)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.21)(64bit) \
libssl3.so(NSS_3.22)(64bit) \
libssl3.so(NSS_3.23)(64bit) \
libssl3.so(NSS_3.27)(64bit) \
libssl3.so(NSS_3.28)(64bit) \
libssl3.so(NSS_3.30.0.1)(64bit) \
libssl3.so(NSS_3.33)(64bit) \
libssl3.so(NSS_3.4)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.3.4)(64bit) \
libz.so.1(ZLIB_1.2.9)(64bit) \
mozilla-nspr \
mozilla-nss \
textutils"

inherit rpm
