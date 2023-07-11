SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss02-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "b6c494573e95e4cb249de782ec15532497a68bd3ff05a4790f6630f6586ee91bf87b1afd93966768b77c710a51c8a39b5c76431298e1be987bff2dc88bff7a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
