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

RPM_NAME = "QtAV-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "116d1a5d5938d7a428087d70ebd2e869d14bab54e26fc9dd9614d4ba697e2edcbd2be0bb6ea9c596db9f46393b04c588a590f0a9cd3b0b0444e36fb091891950"

RPROVIDES:${PN} += "QtAV \
QtAV(aarch-64)"

RDEPENDS:${PN} += "QtAV-players"

inherit rpm
