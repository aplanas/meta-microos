SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-m68k-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "dc4062ea5671f1e13c3b7d0d7df6f087e89977c0ddb3bf1bc8e29dd33e5d1214dbc6766859394ae0bb6140e9ac530043972d70b09292f81c1176fcf8b757aae6"

RPROVIDES:${PN} += "cross-m68k-gcc11 cross-m68k-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-m68k-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
