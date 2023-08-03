SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss06-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "eaa888b643eea8649f720372671e6ab94b8fe65e214b8e28838c7546583a83eea35fd13cebb1361bb5a9400000e8bf4125f1d102b6796b671bd8f51589359725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
