SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-0_0-0-0.0.3-2.1.aarch64.rpm"
RPM_HASH = "234562371032148ecd1ae53999def5c8614168dd376670777c367bc04f28c08c8dfc8aa9e56c9d688c23e6bcebd186ab2e8191dad5826f093777d62e118c2351"

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
