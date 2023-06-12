SUMMARY = "A virtual Lighttable and Darkroom"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "darktable-4.2.1-1.4.aarch64.rpm"
RPM_HASH = "707d34fb4e1911b73946913a7220bb25cca805ae55041a507e5c53066a597d029274d226514db5672a805f864597cc418124a00702db7b357f74d03c3afbfb93"

RPROVIDES:${PN} += "application() application(org.darktable.darktable.desktop) darktable darktable(aarch-64) darktable-docs libashift.so()(64bit) libatrous.so()(64bit) libavif.so()(64bit) libbackgroundjobs.so()(64bit) libbasecurve.so()(64bit) libbasicadj.so()(64bit) libbilat.so()(64bit) libbilateral.so()(64bit) libbloom.so()(64bit) libblurs.so()(64bit) libborders.so()(64bit) libcacorrect.so()(64bit) libcacorrectrgb.so()(64bit) libcamera.so()(64bit) libcensorize.so()(64bit) libchannelmixer.so()(64bit) libchannelmixerrgb.so()(64bit) libclahe.so()(64bit) libclipping.so()(64bit) libcolisa.so()(64bit) libcollect.so()(64bit) libcolorbalance.so()(64bit) libcolorbalancergb.so()(64bit) libcolorchecker.so()(64bit) libcolorcontrast.so()(64bit) libcolorcorrection.so()(64bit) libcolorin.so()(64bit) libcolorize.so()(64bit) libcolorlabels.so()(64bit) libcolormapping.so()(64bit) libcolorout.so()(64bit) libcolorpicker.so()(64bit) libcolorreconstruct.so()(64bit) libcolortransfer.so()(64bit) libcolorzones.so()(64bit) libcopy.so()(64bit) libcopy_history.so()(64bit) libcrop.so()(64bit) libdarkroom.so()(64bit) libdarktable.so()(64bit) libdarktable_label.so()(64bit) libdefringe.so()(64bit) libdemosaic.so()(64bit) libdenoiseprofile.so()(64bit) libdiffuse.so()(64bit) libdisk.so()(64bit) libdither.so()(64bit) libduplicate.so()(64bit) libemail.so()(64bit) libequalizer.so()(64bit) libexport.so()(64bit) libexposure.so()(64bit) libexr.so()(64bit) libfilmic.so()(64bit) libfilmicrgb.so()(64bit) libfilmstrip.so()(64bit) libfilter.so()(64bit) libfiltering.so()(64bit) libfinalscale.so()(64bit) libflip.so()(64bit) libgallery.so()(64bit) libgamepad.so()(64bit) libgamma.so()(64bit) libgeotagging.so()(64bit) libglobal_toolbox.so()(64bit) libglobaltonemap.so()(64bit) libgraduatednd.so()(64bit) libgrain.so()(64bit) libhazeremoval.so()(64bit) libhighlights.so()(64bit) libhighpass.so()(64bit) libhinter.so()(64bit) libhistogram.so()(64bit) libhistory.so()(64bit) libhotpixels.so()(64bit) libimage.so()(64bit) libimage_infos.so()(64bit) libimport.so()(64bit) libinvert.so()(64bit) libioporder.so()(64bit) libj2k.so()(64bit) libjpeg.so()(64bit) libjpegxl.so()(64bit) libknight.so()(64bit) liblatex.so()(64bit) liblens.so()(64bit) liblevels.so()(64bit) liblighttable.so()(64bit) liblighttable_mode.so()(64bit) libliquify.so()(64bit) liblive_view.so()(64bit) liblocation.so()(64bit) liblowlight.so()(64bit) liblowpass.so()(64bit) liblut3d.so()(64bit) libmap.so()(64bit) libmap_locations.so()(64bit) libmap_settings.so()(64bit) libmask_manager.so()(64bit) libmasks.so()(64bit) libmetadata.so()(64bit) libmetadata_view.so()(64bit) libmidi.so()(64bit) libmodule_toolbox.so()(64bit) libmodulegroups.so()(64bit) libmonochrome.so()(64bit) libnavigation.so()(64bit) libnegadoctor.so()(64bit) libnlmeans.so()(64bit) liboverexposed.so()(64bit) libpdf.so()(64bit) libpfm.so()(64bit) libpiwigo.so()(64bit) libpng.so()(64bit) libppm.so()(64bit) libprint.so()(64bit) libprint_settings.so()(64bit) libprofile_gamma.so()(64bit) libratings.so()(64bit) librawdenoise.so()(64bit) librawoverexposed.so()(64bit) librawprepare.so()(64bit) librecentcollect.so()(64bit) librelight.so()(64bit) libretouch.so()(64bit) librgbcurve.so()(64bit) librgblevels.so()(64bit) librotatepixels.so()(64bit) libscalepixels.so()(64bit) libselect.so()(64bit) libsession.so()(64bit) libshadhi.so()(64bit) libsharpen.so()(64bit) libsigmoid.so()(64bit) libslideshow.so()(64bit) libsnapshots.so()(64bit) libsoften.so()(64bit) libsplittoning.so()(64bit) libspots.so()(64bit) libstyles.so()(64bit) libtagging.so()(64bit) libtemperature.so()(64bit) libtethering.so()(64bit) libtiff.so()(64bit) libtimeline.so()(64bit) libtonecurve.so()(64bit) libtoneequal.so()(64bit) libtonemap.so()(64bit) libvelvia.so()(64bit) libvibrance.so()(64bit) libview_toolbox.so()(64bit) libviewswitcher.so()(64bit) libvignette.so()(64bit) libwatermark.so()(64bit) libwebp.so()(64bit) libxcf.so()(64bit) libzonesystem.so()(64bit) metainfo() metainfo(org.darktable.darktable.appdata.xml) mimehandler(application/x-darktable) mimehandler(image/aces) mimehandler(image/avif) mimehandler(image/heic) mimehandler(image/heif) mimehandler(image/jp2) mimehandler(image/jpeg) mimehandler(image/jxl) mimehandler(image/png) mimehandler(image/tiff) mimehandler(image/vnd.radiance) mimehandler(image/webp) mimehandler(image/x-adobe-dng) mimehandler(image/x-canon-cr2) mimehandler(image/x-canon-cr3) mimehandler(image/x-canon-crw) mimehandler(image/x-dcraw) mimehandler(image/x-exr) mimehandler(image/x-fuji-raf) mimehandler(image/x-kodak-dcr) mimehandler(image/x-kodak-kdc) mimehandler(image/x-minolta-mrw) mimehandler(image/x-nikon-nef) mimehandler(image/x-nikon-nrw) mimehandler(image/x-olympus-orf) mimehandler(image/x-panasonic-rw) mimehandler(image/x-panasonic-rw2) mimehandler(image/x-pentax-pef) mimehandler(image/x-portable-bitmap) mimehandler(image/x-portable-floatmap) mimehandler(image/x-portable-graymap) mimehandler(image/x-portable-pixmap) mimehandler(image/x-sony-arw) mimehandler(image/x-sony-sr2) mimehandler(image/x-sony-srf)"
RDEPENDS:${PN} += "/bin/bash iso-codes ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libIex-3_1.so.30()(64bit) libImath-3_1.so.29()(64bit) libOpenEXR-3_1.so.30()(64bit) libSDL2-2.0.so.0()(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libavif.so.15()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcolord-gtk.so.1()(64bit) libcolord.so.2()(64bit) libcups.so.2()(64bit) libcurl.so.4()(64bit) libexiv2.so.27()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmic.so.3()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_2.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libgphoto2.so.6()(64bit) libgphoto2_port.so.12()(64bit) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) libgtk-3.so.0()(64bit) libheif.so.1()(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) liblcms2.so.2()(64bit) liblensfun.so.1()(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenjp2.so.7()(64bit) libosmgpsmap-1.0.so.1()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libportmidi.so.2()(64bit) libpugixml.so.1()(64bit) librsvg-2.so.2()(64bit) libsecret-1.so.0()(64bit) libsoup-2.4.so.1()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwebp.so.7()(64bit) libwebpmux.so.3()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
