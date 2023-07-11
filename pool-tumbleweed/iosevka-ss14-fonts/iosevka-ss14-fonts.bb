SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss14-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "3889256ea15ab3118cc9fd430b05f5312abe7046e204a9ad71318d883c021eb33e1cb432df302c935b15f1580b1a1c183138b254b549e3d5a360641c45a5f0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
