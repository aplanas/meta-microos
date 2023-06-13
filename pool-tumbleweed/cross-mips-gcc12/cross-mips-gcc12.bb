SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-mips-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "2ce3c9190f39e193570b9a192480922e40e4e40531bb3edf12ea9a86fbd5c3cf32ee402fcead31aad3718547db69358357b7e13a156925c52f47b0e9395407b7"

RPROVIDES:${PN} += "cross-mips-gcc12 \
cross-mips-gcc12(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
