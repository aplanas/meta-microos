SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswresample-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "ae11bd46997ce3ac44b177ea626d7428e59a751453f43289508cc86983370c69e80e0e4cb873c090e2bf6886ab6a1e607ad336c269d770634a498194765d4afd"

RPROVIDES:${PN} += "ffmpeg-5-libswresample-devel ffmpeg-5-libswresample-devel(aarch-64) libswresample-devel pkgconfig(libswresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavutil-devel libswresample4_ff5 pkgconfig(libavutil)"

inherit rpm
