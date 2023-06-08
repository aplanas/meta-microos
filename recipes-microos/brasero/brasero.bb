SUMMARY = "CD/DVD burning application for GNOME"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write to CD/DVDs. \
 \
For data CDs/DVDs, Brasero supports multisession, Joliet extensions \
and on-the-fly image generation. The file manager can automatically \
ignore unwanted files. \
 \
For Red Book audio CDs, Brasero supports CD-TEXT, on-the-fly transcoding from \
Ogg/FLAC/etc., and intra-track silence configuration. \
 \
Brasero is capable of copying CDs/DVDs to an image file on disk and \
vice-versa. BIN/CUE is supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "brasero-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "baa0827787ed9257111ae58c8f51158b2f5710a9fe0eb71d9e46a4e8b8101fe74cb1f47b36803c93730325bf1d3e7194faaa00c1f154a077885dae2af42e0976"

RPROVIDES:${PN} += "application() application(brasero.desktop) brasero brasero(aarch-64) brasero-doc gnomebaker libbrasero-audio2cue.so()(64bit) libbrasero-burn-uri.so()(64bit) libbrasero-cdda2wav.so()(64bit) libbrasero-cdrdao.so()(64bit) libbrasero-cdrecord.so()(64bit) libbrasero-checksum-file.so()(64bit) libbrasero-checksum.so()(64bit) libbrasero-dvdauthor.so()(64bit) libbrasero-dvdcss.so()(64bit) libbrasero-dvdrwformat.so()(64bit) libbrasero-genisoimage.so()(64bit) libbrasero-growisofs.so()(64bit) libbrasero-libburn.so()(64bit) libbrasero-libisofs.so()(64bit) libbrasero-local-track.so()(64bit) libbrasero-mkisofs.so()(64bit) libbrasero-normalize.so()(64bit) libbrasero-readcd.so()(64bit) libbrasero-readom.so()(64bit) libbrasero-transcode.so()(64bit) libbrasero-vcdimager.so()(64bit) libbrasero-vob.so()(64bit) libbrasero-wodim.so()(64bit) metainfo() metainfo(brasero.appdata.xml) mimehandler(application/x-brasero) mimehandler(application/x-cd-image) mimehandler(application/x-cdrdao-toc) mimehandler(application/x-cue) mimehandler(application/x-toc) mimehandler(audio/x-mp3-playlist) mimehandler(audio/x-mpegurl) mimehandler(audio/x-ms-asx) mimehandler(audio/x-scpls) mimehandler(x-content/audio-cdda) mimehandler(x-content/image-picturecd) mimehandler(x-content/video-dvd) mimehandler(x-content/video-svcd) mimehandler(x-content/video-vcd)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/cdda2wav /usr/bin/cdrecord /usr/bin/mkisofs /usr/bin/readcd cdrdao gstreamer gstreamer-plugins-base gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrasero-burn3.so.1()(64bit) libbrasero-media3.so.1()(64bit) libbrasero-utils3.so.1()(64bit) libburn.so.4()(64bit) libburn.so.4(LIBBURN4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libisofs.so.6()(64bit) libisofs.so.6(LIBISOFS6)(64bit) libpango-1.0.so.0()(64bit) libtotem-plparser.so.18()(64bit) libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) libtracker-sparql-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit)"

inherit rpm
