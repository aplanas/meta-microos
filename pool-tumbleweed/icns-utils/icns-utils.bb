SUMMARY = "Application for manipulation of the Mac OS icns"
DESCRIPTION = "Utilities to convert to and from icns files using libicns: \
    1. png2icns: Tool to convert png icons to icns icons, \
    2. icns2png: Tool to convert icns icons to png, and \
    3. icontainer2icns: Tool for extracting icns files from icontainers."
LICENSE = "GPL-2.0-only"

PV = "0.8.1+git20201014"

RPM_NAME = "icns-utils-0.8.1+git20201014-1.11.aarch64.rpm"
RPM_HASH = "c68dd2bdbb28c00291bed9d64499521aa268263fe23621e3d966e104e07dca5d1ed89a479947ce0ca5427ff9896c9c5ceeda71bb2bac088016ef95276184e3d6"

RPROVIDES:${PN} += "icns-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicns.so.1 \
libpng16.so.16"

inherit rpm
