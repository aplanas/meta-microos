SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss08-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "cae554389340e09b7e892bce61aae03790df8ae89de7b84a08ffa7f36aa2ad11b946e1755b586fa4c0ab49dac7cd12813da3de95b18649c6e96d469c4bdf5e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
