SUMMARY = "System libraries for libicns"
DESCRIPTION = "System libraries file for libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns1-0.8.1+git20201014-1.11.aarch64.rpm"
RPM_HASH = "4fac6fb74aab2b3e014d28302d2c2df2972428180aee42162e255913bca67729f2c54286f284256940d5e2de346e9d73d7a016eace814f00d1f93c0f0ab4cc6f"

RPROVIDES:${PN} += "libicns.so.1 \
libicns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenjp2.so.7 \
libpng16.so.16"

inherit rpm
