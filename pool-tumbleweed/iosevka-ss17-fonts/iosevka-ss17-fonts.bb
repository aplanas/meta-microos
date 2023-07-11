SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss17-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "27ab05f0b1f970487d6e4377df2ef9b67d99816903d20d0833b7c2ecc42b804974bce8c9b062228d4b7e05801929b6e24f709cd7250f5955ec524d1e869aeb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
