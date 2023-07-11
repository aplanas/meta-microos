SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss12-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "58c87e3c0f4cf8d101616a414b7d496850e4ac7bf2b863df4c8a2f590a1131c42fdafcd52978f049204ff2bc9462285cb02f979975554821c36981177052bb0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
