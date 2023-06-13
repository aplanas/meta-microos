SUMMARY = "A Free Office Suite (Framework)"
DESCRIPTION = "LibreOffice is a comprehensive office package featuring a word \
processor, a spreadsheet, a presentation program, and much more. This \
package provides only the basic framework. You have to install the \
additional modules to get the required functionality, see packages: \
 \
- libreoffice-base \
- libreoffice-calc \
- libreoffice-draw \
- libreoffice-impress \
- libreoffice-math \
- libreoffice-writer \
 \
Some optional features are provided by extra packages, for example: \
 \
- libreoffice-mailmerge \
- libreoffice-filters \
- libreoffice-qt5 \
- libreoffice-gnome \
 \
Non-English localizations are provided by extra packages as well, for \
example: \
 \
- libreoffice-l10n-de \
- libreoffice-l10n-fr \
- libreoffice-l10n-it"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "1774c25c4c9b606ddcd03115b32e2d7da1a6f8c527fe6ad253ce6c5be7b0ffeae2ed2bc98219d36c0bc283a86dbf86eb6b0e548574a4a6b1e88a15cd71097b82"

RPROVIDES:${PN} += "application() \
application(libreoffice-startcenter.desktop) \
config(libreoffice) \
libLanguageToollo.so()(64bit) \
libacclo.so()(64bit) \
libaffine_uno_uno.so()(64bit) \
libanimcorelo.so()(64bit) \
libavmediagst.so()(64bit) \
libbiblo.so()(64bit) \
libbinaryurplo.so()(64bit) \
libbootstraplo.so()(64bit) \
libcached1.so()(64bit) \
libcairocanvaslo.so()(64bit) \
libchartcontrollerlo.so()(64bit) \
libchartcorelo.so()(64bit) \
libclewlo.so()(64bit) \
libcmdmaillo.so()(64bit) \
libcollator_data.so()(64bit) \
libcuilo.so()(64bit) \
libdbahsqllo.so()(64bit) \
libdbalo.so()(64bit) \
libdbaselo.so()(64bit) \
libdbaxmllo.so()(64bit) \
libdbpool2.so()(64bit) \
libdeploymentgui.so()(64bit) \
libdesktop_detectorlo.so()(64bit) \
libdict_ja.so()(64bit) \
libdict_zh.so()(64bit) \
libdlgprovlo.so()(64bit) \
libembobj.so()(64bit) \
libemboleobj.so()(64bit) \
libexpwraplo.so()(64bit) \
libfilelo.so()(64bit) \
libflatlo.so()(64bit) \
libgcc3_uno.so()(64bit) \
libgraphicfilterlo.so()(64bit) \
libhsqldb.so()(64bit) \
libi18nlangtag.so()(64bit) \
libicglo.so()(64bit) \
libindex_data.so()(64bit) \
libintrospectionlo.so()(64bit) \
libinvocadaptlo.so()(64bit) \
libinvocationlo.so()(64bit) \
libiolo.so()(64bit) \
libjava_uno.so()(64bit) \
libjavaloaderlo.so()(64bit) \
libjavavmlo.so()(64bit) \
libjdbclo.so()(64bit) \
libjpipe.so()(64bit) \
libjuh.so()(64bit) \
libjuhx.so()(64bit) \
libjvmaccesslo.so()(64bit) \
libjvmfwklo.so()(64bit) \
libldapbe2lo.so()(64bit) \
liblibreofficekitgtk.so()(64bit) \
liblocaledata_en.so()(64bit) \
liblocaledata_es.so()(64bit) \
liblocaledata_euro.so()(64bit) \
liblocaledata_others.so()(64bit) \
liblog_uno_uno.so()(64bit) \
libloglo.so()(64bit) \
libmergedlo.so()(64bit) \
libmigrationoo2lo.so()(64bit) \
libmigrationoo3lo.so()(64bit) \
libmozbootstraplo.so()(64bit) \
libmsformslo.so()(64bit) \
libmysql_jdbclo.so()(64bit) \
libnamingservicelo.so()(64bit) \
libodbclo.so()(64bit) \
libooxlo.so()(64bit) \
libpcrlo.so()(64bit) \
libpdffilterlo.so()(64bit) \
libpdfiumlo.so()(64bit) \
libprotocolhandlerlo.so()(64bit) \
libproxyfaclo.so()(64bit) \
libreflectionlo.so()(64bit) \
libreglo.so()(64bit) \
libreoffice \
libreoffice(aarch-64) \
libreoffice-base-extensions \
libreoffice-draw-extensions \
libreoffice-icon-theme-crystal \
libreoffice-icon-theme-oxygen \
libreoffice-impress-extensions \
libreoffice-kde \
libreoffice-l10n-prebuild \
libreoffice-mono \
libreoffice-ure \
libsal_textenclo.so()(64bit) \
libscnlo.so()(64bit) \
libscriptframe.so()(64bit) \
libsdbc2.so()(64bit) \
libsdbtlo.so()(64bit) \
libsddlo.so()(64bit) \
libsdlo.so()(64bit) \
libsduilo.so()(64bit) \
libskialo.so()(64bit) \
libslideshowlo.so()(64bit) \
libstocserviceslo.so()(64bit) \
libstoragefdlo.so()(64bit) \
libstorelo.so()(64bit) \
libsvgfilterlo.so()(64bit) \
libswlo.so()(64bit) \
libtextconv_dict.so()(64bit) \
libtextconversiondlgslo.so()(64bit) \
libucpchelp1.so()(64bit) \
libucpcmis1lo.so()(64bit) \
libucpdav1.so()(64bit) \
libucpftp1.so()(64bit) \
libucppkg1.so()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_purpenvhelpergcc3.so.3()(64bit) \
libuno_purpenvhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libunoidllo.so()(64bit) \
libunopkgapp.so()(64bit) \
libunsafe_uno_uno.so()(64bit) \
libuuresolverlo.so()(64bit) \
libvclplug_genlo.so()(64bit) \
libwpftdrawlo.so()(64bit) \
libwriterperfectlo.so()(64bit) \
libxmlreaderlo.so()(64bit) \
libxmlsecurity.so()(64bit) \
libxsec_xmlsec.so()(64bit) \
mimehandler(application/vnd.openofficeorg.extension) \
mimehandler(x-scheme-handler/ms-access) \
mimehandler(x-scheme-handler/ms-excel) \
mimehandler(x-scheme-handler/ms-powerpoint) \
mimehandler(x-scheme-handler/ms-visio) \
mimehandler(x-scheme-handler/ms-word) \
mimehandler(x-scheme-handler/vnd.libreoffice.cmis) \
mimehandler(x-scheme-handler/vnd.libreoffice.command) \
mimehandler(x-scheme-handler/vnd.sun.star.webdav) \
mimehandler(x-scheme-handler/vnd.sun.star.webdavs)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libZXing.so.3()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libbox2d.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcdr-0.1.so.1()(64bit) \
libclucene-contribs-lib.so.1()(64bit) \
libclucene-core.so.1()(64bit) \
libcups.so.2()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libeot.so.0()(64bit) \
libepoxy.so.0()(64bit) \
liberation-fonts \
libexpat.so.1()(64bit) \
libexslt.so.0()(64bit) \
libexttextcat-2.0.so.0()(64bit) \
libfixmath.so()(64bit) \
libfontconfig.so.1()(64bit) \
libfreehand-0.1.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgmepp.so.6()(64bit) \
libgraphite2.so.3()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz-icu.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libhyphen.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
liblangtag.so.1()(64bit) \
liblcms2.so.2()(64bit) \
libldap.so.2()(64bit) \
libm.so.6()(64bit) \
libmspub-0.1.so.1()(64bit) \
libmwaw-0.3.so.3()(64bit) \
libmythes-1.2.so.0()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnumbertext-1.0.so.0()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libopenjp2.so.7()(64bit) \
liborcus-0.17.so.0()(64bit) \
liborcus-parser-0.17.so.0()(64bit) \
libpagemaker-0.0.so.0()(64bit) \
libplc4.so()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libqxp-0.0.so.0()(64bit) \
libraptor2.so.0()(64bit) \
librdf.so.0()(64bit) \
libreoffice-branding \
libreoffice-icon-themes \
libreoffice-l10n-en \
librevenge-0.0.so.0()(64bit) \
libsmime3.so()(64bit) \
libstaroffice-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libvisio-0.1.so.1()(64bit) \
libwebp.so.7()(64bit) \
libwpg-0.3.so.3()(64bit) \
libxml2.so.2()(64bit) \
libxmlsec1-nss.so.1()(64bit) \
libxmlsec1.so.1()(64bit) \
libxslt.so.1()(64bit) \
libz.so.1()(64bit) \
libzmf-0.0.so.0()(64bit) \
python3 \
rtld(GNU_HASH)"

inherit rpm
