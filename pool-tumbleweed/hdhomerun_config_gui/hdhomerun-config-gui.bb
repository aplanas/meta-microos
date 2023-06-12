SUMMARY = "HDHomeRun GTK GUI"
DESCRIPTION = "The HDHomeRun Config GUI is a GUI tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "GPL-3.0-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config_gui-20190621-1.18.aarch64.rpm"
RPM_HASH = "7a980f5878012a51bf2dc021bd9edc61cb03f72cf97b633be7542b9603bfbba580edfef4bb1cbf6c87690268ff856f1462c403537dc4a7313cad8152dba65667"

RPROVIDES:${PN} += "application() \
application(hdhomerun_config_gui.desktop) \
hdhomerun_config_gui \
hdhomerun_config_gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libhdhomerun.so.2()(64bit) \
libhdhomerun2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
