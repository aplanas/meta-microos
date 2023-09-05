SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss03-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "a21bbaa3aff1c6d6d54fc6d3baa30b3274e8e0e6f3ae9bc5c7a27105d9416c1e2a03115bb38001575db5514e22e9a7df483c5619467511988190ad607fe9fd0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
