SUMMARY = "HDHomeRun GTK GUI"
DESCRIPTION = "The HDHomeRun Config GUI is a GUI tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "GPL-3.0-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config_gui-20190621-1.18.aarch64.rpm"
RPM_HASH = "7a980f5878012a51bf2dc021bd9edc61cb03f72cf97b633be7542b9603bfbba580edfef4bb1cbf6c87690268ff856f1462c403537dc4a7313cad8152dba65667"

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
