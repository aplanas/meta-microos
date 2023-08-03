SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-hppa-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "158099a61809d62f71306185fa33d52572b5b311d9ca9ac19f920ace50c8b12ece739c1e2aebbb86287d7a41795fc1063fe3e6d76f3341f710a265a231f9de46"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
