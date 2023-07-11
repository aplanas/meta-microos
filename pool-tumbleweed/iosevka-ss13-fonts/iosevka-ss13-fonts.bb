SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss13-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "f61d1a984e5b392cc517ed68c2a3bc683826a8cac97c9c565b70df0b2794a82d944913e7aeffeac827fc4e0bacc959a65f80797c75029dc437bcf72022742b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
