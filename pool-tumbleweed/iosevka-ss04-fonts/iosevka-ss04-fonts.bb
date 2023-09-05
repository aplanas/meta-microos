SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss04-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "d3eef16c706286415845dcec6e16164b50b68c2f09a62bda3805a221aed16194b7e91c8339fc50023095f3e1a15be6184ed51c1230e085bfb43a66d08dd30e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
