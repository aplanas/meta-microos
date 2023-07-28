SUMMARY = "Bash completion routines for the kmod utilities"
DESCRIPTION = "Contains bash completion support for kmod utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-bash-completion-30-6.1.noarch.rpm"
RPM_HASH = "e3fde312b6a9cf0e1bb7aafda3879cd4e2c8b7e610ba2ebc466fbad394eb7927fe28759c81391e23ae0c1f08b610bffdd90db4a49349067d584523fbc8b6df29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmod-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kmod"

inherit rpm
