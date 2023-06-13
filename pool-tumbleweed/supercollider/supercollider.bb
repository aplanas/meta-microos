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

RPROVIDES:${PN} += "application() \
application(SuperColliderIDE.desktop) \
mimehandler(text/x-sc) \
supercollider \
supercollider(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
