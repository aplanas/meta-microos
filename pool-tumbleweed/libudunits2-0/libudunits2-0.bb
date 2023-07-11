SUMMARY = "Libraries for udunits2"
DESCRIPTION = "This package contains the runtime libraries for udunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "libudunits2-0-2.2.28-1.9.aarch64.rpm"
RPM_HASH = "7106e513b9ce35029e9e785e3756f1794f2078c2d112f85f450dff136d2125423d62194e4edf8543491ecce579be67058ce7eff79ba5f3bcfdbea2cc03db5397"

RPROVIDES:${PN} += "libudunits2-0 \
libudunits2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6"

inherit rpm
