SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-m68k-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d0e14105804502e37d0d1a2c6ab8f8c91dcd82385c770ec63e90aa11fc1a85ba0e8045fa1b6c6a06b58361af580f20598092742ea7946de8c384d2076bb661ef"

RPROVIDES:${PN} += "cross-m68k-gcc13 cross-m68k-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-m68k-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
