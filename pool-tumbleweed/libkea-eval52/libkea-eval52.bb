SUMMARY = "Kea DHCP expression evaluation library"
DESCRIPTION = "The core of the libeval library is a parser that is able to parse an \
expression (e.g. option[123].text == 'APC'). This is currently used \
for client classification."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-eval52-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "796adf8872dab6a9c1d35ef9b4aaabea2b324c19ee630acc2ffc99e3e87cad0d9a6a88c72a1a2867abe11d26e50d23da0903bfab2d6769387cb8c6e10f04bd11"

RPROVIDES:${PN} += "libkea-eval.so.52 \
libkea-eval52"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-dhcp++.so.73 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
