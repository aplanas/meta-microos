SUMMARY = "Application for manipulation of the Mac OS icns"
DESCRIPTION = "Utilities to convert to and from icns files using libicns: \
    1. png2icns: Tool to convert png icons to icns icons, \
    2. icns2png: Tool to convert icns icons to png, and \
    3. icontainer2icns: Tool for extracting icns files from icontainers."
LICENSE = "GPL-2.0-only"

PV = "0.8.1+git20201014"

RPM_NAME = "icns-utils-0.8.1+git20201014-1.10.aarch64.rpm"
RPM_HASH = "1a034c20d0468527064f52d3987532231f2722e4d215e9b23aa87ef8f8f8bda1043ff67381654955a9dd39e5adf94c6e9058da0cda0fd5b9bb0844f3c83cbbfb"

RPROVIDES:${PN} += "icns-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicns.so.1 \
libpng16.so.16"

inherit rpm
