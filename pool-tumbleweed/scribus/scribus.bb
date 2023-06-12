SUMMARY = "Page Layout and Desktop Publishing (DTP)"
DESCRIPTION = "Scribus is a page layout program which produces output in PDF and \
Postscript. \
 \
Scribus supports publishing features such as CMYK and spot colors, \
PDF creation, Encapsulated Postscript import and export and creation \
of color separations."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-1.5.8-4.12.aarch64.rpm"
RPM_HASH = "6ce440d4aeb902a9d3d4fe0f0e7a2143019c68a2df95c3cc0aa83f73ed00afde2fb4b31a146033c8fc39dd98c3b73545a2ec6c165b80060e370baf3feb626fac"

RPROVIDES:${PN} += "application() \
application(scribus.desktop) \
libMARKDOWNimplugin.so()(64bit) \
libbarcodegenerator.so()(64bit) \
libcolorwheel.so()(64bit) \
libcsvim.so()(64bit) \
libdocim.so()(64bit) \
libdocximplugin.so()(64bit) \
libflattenpath.so()(64bit) \
libfontpreview.so()(64bit) \
libhtmlim.so()(64bit) \
libhunspellplugin.so()(64bit) \
libimportai.so()(64bit) \
libimportcdr.so()(64bit) \
libimportcgm.so()(64bit) \
libimportcvg.so()(64bit) \
libimportdrw.so()(64bit) \
libimportemf.so()(64bit) \
libimportfh.so()(64bit) \
libimportidml.so()(64bit) \
libimportodg.so()(64bit) \
libimportpages.so()(64bit) \
libimportpct.so()(64bit) \
libimportpdf.so()(64bit) \
libimportpm.so()(64bit) \
libimportpub.so()(64bit) \
libimportqxp.so()(64bit) \
libimportshape.so()(64bit) \
libimportsml.so()(64bit) \
libimportsvm.so()(64bit) \
libimportviva.so()(64bit) \
libimportvsd.so()(64bit) \
libimportwpg.so()(64bit) \
libimportxar.so()(64bit) \
libimportxfig.so()(64bit) \
libimportxps.so()(64bit) \
libimportzmf.so()(64bit) \
liblenseffects.so()(64bit) \
libmeshdistortion.so()(64bit) \
libodtimplugin.so()(64bit) \
liboodrawimp.so()(64bit) \
libpathalongpath.so()(64bit) \
libpathconnect.so()(64bit) \
libpathcut.so()(64bit) \
libpathfinder.so()(64bit) \
libpathstroker.so()(64bit) \
libpdbim.so()(64bit) \
libpicturebrowser.so()(64bit) \
librtfimplugin.so()(64bit) \
libsaveastemplateplugin.so()(64bit) \
libscribus12format.so()(64bit) \
libscribus134format.so()(64bit) \
libscribus13format.so()(64bit) \
libscribus150format.so()(64bit) \
libscribusexportpixmap.so()(64bit) \
libscribusshortwords.so()(64bit) \
libscriptplugin.so()(64bit) \
libshapeplugin.so()(64bit) \
libsmoothpath.so()(64bit) \
libsubdivide.so()(64bit) \
libsvgexplugin.so()(64bit) \
libsvgimplugin.so()(64bit) \
libsxwimplugin.so()(64bit) \
libtextfilterplugin.so()(64bit) \
libtxtim.so()(64bit) \
libuniconvertorplugin.so()(64bit) \
libwmfimplugin.so()(64bit) \
libxpsexplugin.so()(64bit) \
libxtgimplugin.so()(64bit) \
metainfo() \
metainfo(scribus.appdata.xml) \
mimehandler(application/vnd.scribus) \
scribus \
scribus(aarch-64) \
scribus-devel"
RDEPENDS:${PN} += "hicolor-icon-theme \
libGraphicsMagick-Q16.so.3()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcdr-0.1.so.1()(64bit) \
libcups.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreehand-0.1.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libharfbuzz-icu.so.0()(64bit) \
libharfbuzz-subset.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmspub-0.1.so.1()(64bit) \
libpagemaker-0.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpodofo.so.0.9.8()(64bit) \
libpoppler.so.128()(64bit) \
libpython3.10.so.1.0()(64bit) \
libqxp-0.0.so.0()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libvisio-0.1.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libz.so.1()(64bit) \
libzmf-0.0.so.0()(64bit)"

inherit rpm