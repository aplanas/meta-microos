SUMMARY = "Bash completion routines for the kmod utilities"
DESCRIPTION = "Contains bash completion support for kmod utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-bash-completion-30-8.1.noarch.rpm"
RPM_HASH = "7afc985bc7afd61004cfde2ff2cbb47f37da037b073e0d30bf3d915e86731b3295dfd6324c676a50948e0e2ac381c998a551262353ff1d933328c274d8f92481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmod-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kmod"

inherit rpm
