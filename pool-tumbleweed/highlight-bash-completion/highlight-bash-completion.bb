SUMMARY = "Bash completion for highlight"
DESCRIPTION = "This package provides Bash command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-bash-completion-4.6-1.1.noarch.rpm"
RPM_HASH = "e18b33b0a146f67d8c6504c9bcba2804ec3ad6f84ef963e7a2d3f745b900408c149a76f64dbfc98d3d1000edb59e278032f385c01d9d9e771a4d785ca0871fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-bash-completion"

RDEPENDS:${PN} += "bash-completion \
highlight"

inherit rpm
