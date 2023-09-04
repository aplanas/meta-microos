SUMMARY = "Page Layout and Desktop Publishing (DTP)"
DESCRIPTION = "Scribus is a page layout program which produces output in PDF and \
Postscript. \
 \
Scribus supports publishing features such as CMYK and spot colors, \
PDF creation, Encapsulated Postscript import and export and creation \
of color separations."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-1.5.8-5.1.aarch64.rpm"
RPM_HASH = "0a74b6d9e7e3cc751672e4a7a606d48c8c2d8256d8e9bcaacaf5aa0a34cb637139cf15793a1ce34a4744c212c27d0ddc21e413d54c7e66896a2c9aeaa98293e8"

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
libpoppler.so.130 \
libpython3.11.so.1.0 \
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
