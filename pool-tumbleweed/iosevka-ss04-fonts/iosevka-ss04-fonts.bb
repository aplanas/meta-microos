SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss04-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "247061d8777889d190174e1ae3725d980adf743c5695829be6a2cbcb3ee3e08e7f59d18ddb59fd58eb3b7a11b79221d4c065b547eac18f057f4134ed1339f3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
