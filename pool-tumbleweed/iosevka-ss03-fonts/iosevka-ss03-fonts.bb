SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss03-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "7fa3f7df4e7b0b2959ccdef95e7901cf51c06e97d788bbf4b0f3ab25c9ee6f7697e4b1e19ab24357234b7ddf57b0e0df318f9e86845f7d9e23b8b9193a79d46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
