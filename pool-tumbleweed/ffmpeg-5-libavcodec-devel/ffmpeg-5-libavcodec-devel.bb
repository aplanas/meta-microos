SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavcodec-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "9cd72070915e5336dc6f3c7a23db6820456e091491d29b00bdd9f9cffe4a95c69e6f7582317797d0efb566f04f64cd98f8210fa8d6e6805a543703bf0aebd9d9"

RPROVIDES:${PN} += "ffmpeg-5-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libavcodec59 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
