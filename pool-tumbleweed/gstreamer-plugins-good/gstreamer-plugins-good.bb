SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "e8aa935c64b04161450934742dbad570ad1b1c92ee018338ef6da7f4303e79a2ed71b514a885ea8a1c9d4b32b9c998a0888f11d815de5e35dd0cfb5f692b431d"

RPROVIDES:${PN} += "gst-plugins-good \
gstreamer-plugins-good \
gstreamer1 \
libgstadaptivedemux2.so \
libgstalaw.so \
libgstalpha.so \
libgstalphacolor.so \
libgstapetag.so \
libgstaudiofx.so \
libgstaudioparsers.so \
libgstauparse.so \
libgstautodetect.so \
libgstavi.so \
libgstcutter.so \
libgstdebug.so \
libgstdeinterlace.so \
libgstdtmf.so \
libgsteffectv.so \
libgstequalizer.so \
libgstflac.so \
libgstflv.so \
libgstflxdec.so \
libgstgdkpixbuf.so \
libgstgoom.so \
libgstgoom2k1.so \
libgsticydemux.so \
libgstid3demux.so \
libgstimagefreeze.so \
libgstinterleave.so \
libgstisomp4.so \
libgstjpeg.so \
libgstlame.so \
libgstlevel.so \
libgstmatroska.so \
libgstmpg123.so \
libgstmulaw.so \
libgstmultifile.so \
libgstmultipart.so \
libgstnavigationtest.so \
libgstoss4.so \
libgstossaudio.so \
libgstpng.so \
libgstpulseaudio.so \
libgstreplaygain.so \
libgstrtp.so \
libgstrtpmanager.so \
libgstrtsp.so \
libgstshapewipe.so \
libgstsmpte.so \
libgstsoup.so \
libgstspectrum.so \
libgstspeex.so \
libgsttaglib.so \
libgsttwolame.so \
libgstudp.so \
libgstvideo4linux2.so \
libgstvideobox.so \
libgstvideocrop.so \
libgstvideofilter.so \
libgstvideomixer.so \
libgstvpx.so \
libgstwavenc.so \
libgstwavpack.so \
libgstwavparse.so \
libgstximagesrc.so \
libgstxingmux.so \
libgsty4menc.so"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstfft-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgudev-1.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmp3lame.so.0 \
libmpg123.so.0 \
liborc-0.4.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libspeex.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libtwolame.so.0 \
libv4l2.so.0 \
libvpx.so.8 \
libwavpack.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
