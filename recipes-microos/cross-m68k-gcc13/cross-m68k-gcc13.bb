SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-m68k-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "52c5ea95b169bc20e6a2c5472e40682e0f45200f82712899dc0a2ea29dca76d1157c1cd4c831898e30506378a98e31838e2696783fa389866fdc845bacc970e1"

RPROVIDES:${PN} += "cross-m68k-gcc13 cross-m68k-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-m68k-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
