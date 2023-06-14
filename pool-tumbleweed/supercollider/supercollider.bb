SUMMARY = "Programming environment for audio synthesis and composition"
DESCRIPTION = "SuperCollider is a platform for audio synthesis and algorithmic composition, \
used by musicians, artists, and researchers working with sound. \
SuperCollider consists of three separate components: \
  1. scsynth or supernova - audio engine (the 'server') \
  2. sclang - programming language runtime interpreter including Qt graphical user interfaces \
  3. IDE (integrated development environment) - an editor for writing code and running supercollider"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "257fd0a049a091edfe037ad1ac841cfc5c7665e427975b85e777246a6d9e66f9ddc989896605a869ed8fff995b8805009bb6e3f26bf4f78e2551cd995cad72af"

RPROVIDES:${PN} += "supercollider"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libreadline.so.8 \
libsndfile.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
