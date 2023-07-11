SUMMARY = "HDHomeRun GTK GUI"
DESCRIPTION = "The HDHomeRun Config GUI is a GUI tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "GPL-3.0-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config_gui-20190621-1.19.aarch64.rpm"
RPM_HASH = "61b4a54577e598dda6ab827bbacb428c59755307b668f7d6a8da6e2acccad6e3f835139622dc3867e0da8a7c10355d38f5232e43d0a0dc4f4ac072b132615d24"

RPROVIDES:${PN} += "hdhomerun-config-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libhdhomerun.so.2 \
libhdhomerun2 \
libstdc++.so.6"

inherit rpm
