SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss04-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "0a33a2086a8b3a368aa0622ac243c9e5a872384c860f7f5d98d6747374ba4c6564521c44e0bc63865353fa55900c906cbb20ab2a1c0b28bbd6005c4c16c461b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
