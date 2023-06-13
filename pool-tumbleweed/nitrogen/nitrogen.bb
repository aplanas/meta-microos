SUMMARY = "A background browser and setter for X windows"
DESCRIPTION = " \
Nitrogen is a background browser and setter for X windows. It is written \
in C++ using the gtkmm toolkit. It can be used in two modes: browser and \
recall. Some of the features are: \
 \
* Multihead and Xinerama aware. \
* Recall mode to used via startup script. \
* Uses freedesktop.org standard for thumbnails. \
* Can set GNOME background. \
* Command line set modes for script use. \
* Inotify monitoring of browse directory. \
* Lazy loading of thumbnails - conserves memory . \
* 'Automatic' set mode - determines best mode to set an image based on \
  its size. \
* Display preview images in a tiled icon layout"
LICENSE = "GPL-2.0-only & CC-BY-SA-3.0"

PV = "1.6.1"

RPM_NAME = "nitrogen-1.6.1-1.22.aarch64.rpm"
RPM_HASH = "81ee5bb60d45b81f518270236bb9b5baff8ab3806a5841217a6f40d83ea0ad24d44ac6c2e7037420e7b319302b003d65c61272b1cadc9258ecc10e99ce92e98f"

RPROVIDES:${PN} += "application() \
application(nitrogen.desktop) \
metainfo() \
metainfo(nitrogen.appdata.xml) \
nitrogen \
nitrogen(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdkmm-2.4.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtkmm-2.4.so.1()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
