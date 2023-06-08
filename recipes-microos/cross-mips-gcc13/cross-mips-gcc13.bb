SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-mips-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "b595e88dd68ae8f103b29ddaf2baa1442135b8eb76a2ed61ae4e2af54677e9eb0400f7fcea8e48a07f318afdeaf742e7ea79841e33ab45efad2c059fb1f918f2"

RPROVIDES:${PN} += "cross-mips-gcc13 cross-mips-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-mips-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
