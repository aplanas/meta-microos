SUMMARY = "An integrated web browser, composer, mail/news client, and IRC client"
DESCRIPTION = "SeaMonkey is an all-in-one Internet application suite containing a web \
browser, an e-mail and newsgroup client with an included web feed \
reader and calendar, an HTML editor and web development tools, and an \
IRC client.  SeaMonkey is a successor to the popular Netscape \
Communicator and Mozilla Application Suite, and (unlike its siblings, \
Firefox and Thunderbird) retains Mozilla's more traditional-looking \
interface.  Many Thunderbird and (legacy) Firefox extensions are \
compatible with SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-2.53.16-1.2.aarch64.rpm"
RPM_HASH = "5dc634cc848c19d23db5026538a6ed62db5bb5bba602fb03e10617b44ad752d99949b2ae56cfb41aadb8e50032e02ebbc4486d67a4c84b23bff7775e74677280"

RPROVIDES:${PN} += "browser-npapi \
locale-seamonkey-cs;de;el;en-GB;es-AR;es-ES;fi;fr;hu;it;ja;ka;nb-NO;nl;pl;pt-BR;pt-PT;ru;sk;sv-SE;zh-CN;zh-TW \
seamonkey \
seamonkey-mail \
seamonkey-spellchecker \
seamonkey-translations-common \
seamonkey-translations-other \
seamonkey-venkman \
web-browser"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrender.so.1 \
libXt.so.6 \
libasound.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libicudata.so.73 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libplc4.so \
libplds4.so \
libproxy.so.1 \
libsharpyuv.so.0 \
libsmime3.so \
libssl3.so \
libstartup-notification-1.so.0 \
libstdc++.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1 \
mozilla-nspr \
mozilla-nss"

inherit rpm
