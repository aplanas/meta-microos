SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss03-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "5401f89c059fcdb66f138acedb30b6e77c5150e096a1642b65386a596df878e450ec88b06c737fbd4abf64f522be10160d61c400cd718275e90165d63b1f124c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
