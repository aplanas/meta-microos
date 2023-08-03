SUMMARY = "Bash completion for fwupd"
DESCRIPTION = "This package contain the bash completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-bash-completion-1.8.17-1.1.noarch.rpm"
RPM_HASH = "66c05dc272699761be455b69c9aaf06712e58a3cfc815ed90382a13713815f4c0c1d45596377fe55d300b5d9765beb62c6f12e2493c7e5c9dbf5446e72e4d3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fwupd"

inherit rpm
