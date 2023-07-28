SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss03-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "5994e224194c8755b1593736561998d09b2983322ae9ffca6e53a9fffb269e4387599868b120074a46ba9137c053b052c6adf5af949ba5a5f0a0d684a7d39535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
