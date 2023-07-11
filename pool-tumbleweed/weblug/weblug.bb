SUMMARY = "Simple webhook receiver program"
DESCRIPTION = "Simple webhook receiver program"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "weblug-0.4-1.1.aarch64.rpm"
RPM_HASH = "aab5cd5c6d8d3ef9fc78eaccda880d31b650e5c52557888ca643a41915dedc4df89a280cfa45aff9997deaa5099a36a5a98804378f18f7d2e18b971b13b9e080"

RPROVIDES:${PN} += "config-weblug \
weblug"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
