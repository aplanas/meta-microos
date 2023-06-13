SUMMARY = "FFmpeg plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the FFmpeg plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-ffmpeg-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "00e17b905bb45912de291f638a9561dc9291a4099ccd5117475303fadb21c03762e23241321b83d3ca37b3fca67475b4f10d62577ff51e222946e9c54f627fe3"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-ffmpeg \
audaspace-plugin-ffmpeg(aarch-64) \
libaudffmpeg.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaudaspace.so.1.4()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
