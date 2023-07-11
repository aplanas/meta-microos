SUMMARY = "Shared Libraries for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects."
LICENSE = "EPL-2.0"

PV = "2.11.6"

RPM_NAME = "libCoinUtils3-2.11.6-1.4.aarch64.rpm"
RPM_HASH = "fdd00e7d3e09ecacc9a15ec3e72eff963a542432180f76775d68f8acc048001e8fe4fd0697f4eccbc7f9a66eea3f11f2a3c253742ffc9d4df6ddfc0837d5da76"

RPROVIDES:${PN} += "libCoinUtils.so.3 \
libCoinUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
