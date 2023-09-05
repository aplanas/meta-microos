SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-mips-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "4e3cb994767e6d976c25382e9321f3311d943dee0689b51d78a5e65b57c4fdad771faf67d41cf1b6a9a43ccb642ea3e075645cbb32b7d90003e613ea0883c589"

RPROVIDES:${PN} += "cross-mips-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
