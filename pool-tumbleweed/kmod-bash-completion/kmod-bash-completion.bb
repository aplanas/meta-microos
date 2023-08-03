SUMMARY = "Bash completion routines for the kmod utilities"
DESCRIPTION = "Contains bash completion support for kmod utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-bash-completion-30-7.1.noarch.rpm"
RPM_HASH = "2653c3fa6fef8d6bf680b63f7069a9bc8749050864232bc9e0ecc7ab889636f221c8ad2c4b589fe1cb31430236763b23f993acdb0f3ac69b0c5d8d252a7dcf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmod-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kmod"

inherit rpm
