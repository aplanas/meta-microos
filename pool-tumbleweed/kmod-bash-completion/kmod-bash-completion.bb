SUMMARY = "Bash completion routines for the kmod utilities"
DESCRIPTION = "Contains bash completion support for kmod utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-bash-completion-30-5.1.noarch.rpm"
RPM_HASH = "3a364880b22b5441bf428b53dbcd8c4b8ae3d52e9d6f2308d8a41a2906233700d456cea35b0c4a7fae592d1bfa8073ce6e3fe448160b4b6fb3d1ade1e05c9f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmod-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kmod"

inherit rpm
