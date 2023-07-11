SUMMARY = "LV2 port of the Airwindows plugins"
DESCRIPTION = " \
This is an LV2 port (by Hannes Braun) of the Airwindows plugins \
originally developed by Chris Johnson. \
 \
Right now, only 84 plugins (out of 329) have been ported to LV2."
LICENSE = "MIT"

PV = "18.0"

RPM_NAME = "lv2-airwindows-18.0-1.2.aarch64.rpm"
RPM_HASH = "91cdd4576055418f63c1d8899da2a0f682ecb2ba90a5123d9680ac866a27128ee99d5a23fc0d0e605044c24d885f78d6e6ee0ab4cca4d3998ad4e071c3d145b8"

RPROVIDES:${PN} += "lv2-airwindows"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
