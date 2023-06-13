SUMMARY = "LibreOffice Writer and Web"
DESCRIPTION = "This module allows you to create and edit text and graphics in letters, \
reports, documents and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-writer-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "946aa5ccf4aaadcc15546db08264335421e5593f6cc4b14ebb34fbcd565b76d6241b4dd0471a30f16e66201cbfaaff1dd2fa8bfba86e3bcb05278e436878197f"

RPROVIDES:${PN} += "application() \
application(libreoffice-writer.desktop) \
libhwplo.so()(64bit) \
liblwpftlo.so()(64bit) \
libmswordlo.so()(64bit) \
libreoffice-writer \
libreoffice-writer(aarch-64) \
libswdlo.so()(64bit) \
libswuilo.so()(64bit) \
libt602filterlo.so()(64bit) \
libvbaswobjlo.so()(64bit) \
libwpftwriterlo.so()(64bit) \
libwriterfilterlo.so()(64bit) \
libwriterlo.so()(64bit) \
metainfo() \
metainfo(libreoffice-writer.appdata.xml) \
mimehandler(application/clarisworks) \
mimehandler(application/macwriteii) \
mimehandler(application/msword) \
mimehandler(application/prs.plucker) \
mimehandler(application/rtf) \
mimehandler(application/vnd.apple.pages) \
mimehandler(application/vnd.lotus-wordpro) \
mimehandler(application/vnd.ms-word) \
mimehandler(application/vnd.ms-word.document.macroEnabled.12) \
mimehandler(application/vnd.ms-word.template.macroEnabled.12) \
mimehandler(application/vnd.ms-works) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.oasis.opendocument.text-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.text-master) \
mimehandler(application/vnd.oasis.opendocument.text-master-template) \
mimehandler(application/vnd.oasis.opendocument.text-template) \
mimehandler(application/vnd.oasis.opendocument.text-web) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.template) \
mimehandler(application/vnd.palm) \
mimehandler(application/vnd.stardivision.writer-global) \
mimehandler(application/vnd.sun.xml.writer) \
mimehandler(application/vnd.sun.xml.writer.global) \
mimehandler(application/vnd.sun.xml.writer.template) \
mimehandler(application/vnd.wordperfect) \
mimehandler(application/wordperfect) \
mimehandler(application/x-abiword) \
mimehandler(application/x-aportisdoc) \
mimehandler(application/x-doc) \
mimehandler(application/x-extension-txt) \
mimehandler(application/x-fictionbook+xml) \
mimehandler(application/x-hwp) \
mimehandler(application/x-iwork-pages-sffpages) \
mimehandler(application/x-mswrite) \
mimehandler(application/x-sony-bbeb) \
mimehandler(application/x-starwriter) \
mimehandler(application/x-t602) \
mimehandler(text/plain) \
mimehandler(text/rtf)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libabw-0.1.so.1()(64bit) \
libc.so.6()(64bit) \
libcuilo.so()(64bit) \
libe-book-0.1.so.1()(64bit) \
libepubgen-0.1.so.1()(64bit) \
libetonyek-0.1.so.1()(64bit) \
libfilelo.so()(64bit) \
libgcc_s.so.1()(64bit) \
libi18nlangtag.so()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libmwaw-0.3.so.3()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libooxlo.so()(64bit) \
libreoffice \
librevenge-0.0.so.0()(64bit) \
libstaroffice-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libswlo.so()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libwpd-0.10.so.10()(64bit) \
libwpg-0.3.so.3()(64bit) \
libwps-0.4.so.4()(64bit) \
libwriterperfectlo.so()(64bit) \
libz.so.1()(64bit) \
rtld(GNU_HASH)"

inherit rpm
