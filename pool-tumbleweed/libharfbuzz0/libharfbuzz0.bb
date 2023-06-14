SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "libharfbuzz0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "fab5a0144d1f757b95be9fdce52360a25b8f363f08bfe09d89e374ce3200cd877032856883dbfc556bd0320ca4210c09c4ab711cf403124af0e48b3e1283cc75"

RPROVIDES:${PN} += "libharfbuzz.so.0 \
libharfbuzz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgraphite2.so.3 \
libm.so.6"

inherit rpm
