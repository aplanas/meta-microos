SUMMARY = "Programming environment for audio synthesis and composition"
DESCRIPTION = "SuperCollider is a platform for audio synthesis and algorithmic composition, \
used by musicians, artists, and researchers working with sound. \
SuperCollider consists of three separate components: \
  1. scsynth or supernova - audio engine (the 'server') \
  2. sclang - programming language runtime interpreter including Qt graphical user interfaces \
  3. IDE (integrated development environment) - an editor for writing code and running supercollider"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-3.13.0-1.4.aarch64.rpm"
RPM_HASH = "6771c517077d6d039fb2f82b828360b4700752b6f1bb73e7b149ce32c4d56629aa5366a71ecf764c65b475b44cd6508319354cde690ea4c6a05e835471d87119"

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
