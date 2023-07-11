SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-0-0.24.20-1.2.aarch64.rpm"
RPM_HASH = "e00383ab67077a70a5720914f682abe794c4e1b1c30ddd10c98f6287c3969adb1852ceb890429f37fe30850aac2894d62e4b624c52a1c764f9608ca00a71d3ec"

RPROVIDES:${PN} += "liblilv-0-0 \
liblilv-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0-0 \
libserd-0.so.0 \
libsord-0-0 \
libsord-0.so.0 \
libsratom-0.so.0"

inherit rpm
