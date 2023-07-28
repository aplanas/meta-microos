SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss01-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "8db5075fadfd4ef8789cf61782d5c74e7ace1b1363e51821b2b215b5e44a04093ec51b8f0dfc5064231548b72ff63ab553785116b4224002ecf795fc996b9b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
