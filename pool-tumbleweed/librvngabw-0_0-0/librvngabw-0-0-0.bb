SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-0_0-0-0.0.3-1.3.aarch64.rpm"
RPM_HASH = "ac09312869ae9c19e89ab1379f770647b354c75f2782fea77ccc81ef32be8c60770f3e5d790da6adf04f83c5d7102632b3a7dbc3c740cfe0c6cb69601548cbd7"

RPROVIDES:${PN} += "librvngabw-0-0-0 \
librvngabw-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
