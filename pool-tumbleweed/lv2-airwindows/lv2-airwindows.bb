SUMMARY = "LV2 port of the Airwindows plugins"
DESCRIPTION = " \
This is an LV2 port (by Hannes Braun) of the Airwindows plugins \
originally developed by Chris Johnson. \
 \
Right now, only 111 plugins (out of 358) have been ported to LV2."
LICENSE = "MIT"

PV = "22.0"

RPM_NAME = "lv2-airwindows-22.0-1.1.aarch64.rpm"
RPM_HASH = "75662a2925d5a95810f019cf5b27b82e8e8b17fb093231a35129d02d2d1d822ef488add8d9a2cf3dade22d0372235a6d9b1da88e252a8dc924e147ed492fe0f5"

RPROVIDES:${PN} += "lv2-airwindows"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
