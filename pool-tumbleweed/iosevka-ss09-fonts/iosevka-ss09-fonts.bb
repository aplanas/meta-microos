SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss09-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "4c9f241362abf0e0448b38d1797ced3e1e8994a9f34d18a9276c2cf4ef743fe9ce92839af413055a050350c4bff8ccc8ba804d51fa19d04fcf9bfcf5313acc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
