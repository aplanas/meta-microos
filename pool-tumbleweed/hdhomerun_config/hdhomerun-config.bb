SUMMARY = "HDHomeRun Config tool"
DESCRIPTION = "hdhomerun_config is a command line tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config-20190621-1.19.aarch64.rpm"
RPM_HASH = "de19bc5dd127e40fef60ab1c8a9efd72e17c7c4968acf6105462f6d4e7480649ec39300b476b6d91ebd97074fe91cc1bb08d67d21e7fb3dbb17c21a903ed4ab3"

RPROVIDES:${PN} += "hdhomerun-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
