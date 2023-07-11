SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-mips-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "27571126ef1975506f3eb41e3507f1ff5311021e6079cbadefdf4a6378d48c9db6ee9bdafda47760452a126a083b2d29819e232df5949196b03e2a9cbfbdbc90"

RPROVIDES:${PN} += "cross-mips-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
