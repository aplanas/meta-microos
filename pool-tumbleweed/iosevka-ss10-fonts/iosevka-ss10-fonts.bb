SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss10-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "6dc32077908564c7f43a10512e9df12740a4340313669ad1df5003ec10f7ad5697b73d2d460c0a2f3597eb5de0962fdb4e1b63c62adb1a444c7610674e89e06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
