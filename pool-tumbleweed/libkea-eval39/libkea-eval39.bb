SUMMARY = "Kea DHCP expression evaluation library"
DESCRIPTION = "The core of the libeval library is a parser that is able to parse an \
expression (e.g. option[123].text == 'APC'). This is currently used \
for client classification."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-eval39-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "ca5b1b12790e096b0e52eb5758959a709c762742cdf0b4fbfa2531dc5b2102c73930cf8c8a4589683c4a5d4a5c0fde10b54b49c812325f8c4124055490a8fb61"

RPROVIDES:${PN} += "libkea-eval.so.39 \
libkea-eval39"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-dhcp++.so.54 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
