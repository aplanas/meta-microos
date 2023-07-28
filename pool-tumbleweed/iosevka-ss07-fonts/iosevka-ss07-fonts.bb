SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss07-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "4c7fabadf02ac9b7149e6dbfaffc333c08696592133f557101998916099563198318acd9ddf6341d2bdcdf509634a74ff8aeb5928548f4698c92119418499789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
