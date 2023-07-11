SUMMARY = "Kea database abstraction library"
DESCRIPTION = "Kea's database abstraction library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-database35-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "f82e5ac6a430701fcd43228c0fa92496d93bca0b598df8d5c12ef84d15a1575c4ef6a39639965d624fff7ab590063b3e41c21c680eb096d89b9223ee20a7242c"

RPROVIDES:${PN} += "libkea-database.so.35 \
libkea-database35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.39 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
