SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-mips-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "9be0bff9594256abd5410f720e02dcb6f0fb17219485a2dab09ee448ff7cba34a268d6293a6c1cf9a79a49959b8428dc588bb8c9a05a365f138eecfeede0bc46"

RPROVIDES:${PN} += "cross-mips-gcc11 cross-mips-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-mips-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
