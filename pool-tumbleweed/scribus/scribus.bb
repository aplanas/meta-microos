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

RPROVIDES:${PN} += "libMARKDOWNimplugin.so \
libbarcodegenerator.so \
libcolorwheel.so \
libcsvim.so \
libdocim.so \
libdocximplugin.so \
libflattenpath.so \
libfontpreview.so \
libhtmlim.so \
libhunspellplugin.so \
libimportai.so \
libimportcdr.so \
libimportcgm.so \
libimportcvg.so \
libimportdrw.so \
libimportemf.so \
libimportfh.so \
libimportidml.so \
libimportodg.so \
libimportpages.so \
libimportpct.so \
libimportpdf.so \
libimportpm.so \
libimportpub.so \
libimportqxp.so \
libimportshape.so \
libimportsml.so \
libimportsvm.so \
libimportviva.so \
libimportvsd.so \
libimportwpg.so \
libimportxar.so \
libimportxfig.so \
libimportxps.so \
libimportzmf.so \
liblenseffects.so \
libmeshdistortion.so \
libodtimplugin.so \
liboodrawimp.so \
libpathalongpath.so \
libpathconnect.so \
libpathcut.so \
libpathfinder.so \
libpathstroker.so \
libpdbim.so \
libpicturebrowser.so \
librtfimplugin.so \
libsaveastemplateplugin.so \
libscribus12format.so \
libscribus134format.so \
libscribus13format.so \
libscribus150format.so \
libscribusexportpixmap.so \
libscribusshortwords.so \
libscriptplugin.so \
libshapeplugin.so \
libsmoothpath.so \
libsubdivide.so \
libsvgexplugin.so \
libsvgimplugin.so \
libsxwimplugin.so \
libtextfilterplugin.so \
libtxtim.so \
libuniconvertorplugin.so \
libwmfimplugin.so \
libxpsexplugin.so \
libxtgimplugin.so \
scribus \
scribus-devel"

RDEPENDS:${PN} += "hicolor-icon-theme \
libGraphicsMagick-Q16.so.3 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcairo.so.2 \
libcdr-0.1.so.1 \
libcups.so.2 \
libfontconfig.so.1 \
libfreehand-0.1.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libharfbuzz-icu.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libhunspell-1.7.so.0 \
libicuuc.so.73 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libmspub-0.1.so.1 \
libpagemaker-0.0.so.0 \
libpng16.so.16 \
libpodofo.so.0.9.8 \
libpoppler.so.128 \
libpython3.10.so.1.0 \
libqxp-0.0.so.0 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libvisio-0.1.so.1 \
libxml2.so.2 \
libz.so.1 \
libzmf-0.0.so.0"

inherit rpm
