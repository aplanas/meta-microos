SUMMARY = "Berkeley Open Infrastructure For Network Computing library"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "libboinc7-7.22.2-1.1.aarch64.rpm"
RPM_HASH = "d0ee0c1d88a98fcd3184101d65937a7c6e7afd0df2704b955176bdcfeef36fcc50d1067f083c6fb0ac914547724dbb74d0f63297b96b089a9c2a941477d0163c"

RPROVIDES:${PN} += "libboinc.so.7()(64bit) \
libboinc7 \
libboinc7(aarch-64) \
libboinc_crypt.so.7()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
