SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss09-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "430fc5c1da6ca8d4a9abbfdef2e7f541c8bca24c4798f2b88c174c8eb7dae4aca3565830eac37c520d912762c32ce382f1ea0a4c07125d5b5960f8afefd8d4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
