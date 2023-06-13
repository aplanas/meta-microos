SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss04-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "9e813c38c9e9b0afaca0e3e8de3c6d88418a2569937b38f7445ad0155a52912ba6d993ed8e21f1f7e265d41b2acf63ec68ab27559c107c00d0ef8ce4e9169e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
