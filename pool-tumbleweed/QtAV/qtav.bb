SUMMARY = "Qt multimedia framework"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. It can help \
facilitate writing a player application. \
 \
Features include: \
   * Hardware decoding suppprt: DXVA2, VAAPI, VDA, CedarX, CUDA \
   * OpenGL and ES2 support for Hi10P and other 16-bit YUV videos \
   * Real time preview \
   * Video capture in RGB and YUV format \
   * OSD and custom filters \
   * Subtitles \
   * Transform video using GraphicsItemRenderer. (rotate, shear, etc) \
   * Playing frame by frame (currently support forward playing) \
   * Playback speed control \
   * Variant streams: locale file, http, rtsp, etc. \
   * Audio channel, tracks and external audio tracks \
   * Dynamically change render engine when playing \
   * Multiple video outputs for 1 player \
   * Region of interest(ROI), i.e. video cropping \
   * Video eq: brightness, contrast, saturation, hue \
   * QML support as a plugin. Most playback APIs are compatible with \
     QtMultiMedia module"
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "3387b8866c3c81f3d590578daf5cdeb6b2499c14ebc9aabc3e98bfbfccc9c9452d3d115dda235d5e59bae522d892abb106f1c079d46b58cdfac4867e0321ea2f"

RPROVIDES:${PN} += "QtAV"

RDEPENDS:${PN} += "QtAV-players"

inherit rpm
