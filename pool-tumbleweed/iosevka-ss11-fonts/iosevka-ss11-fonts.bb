SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss11-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "2539845596ce6822c8d165467ea39c543c2132aaaff2996a79d4ad87fc8d80df6ed41cd7608d2d29c337c005d6904605e201ff796beb4ac8aee3dd3b72d0a6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
