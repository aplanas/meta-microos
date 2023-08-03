SUMMARY = "Fish completion for fwupd"
DESCRIPTION = "This package contain the fish completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-fish-completion-1.8.17-1.1.noarch.rpm"
RPM_HASH = "fa2745c3657aa4038c82258e640cdd2d3b940a37b87eca56d195c2d1fda9e3a51b8b1ef211ec6c70b2ee39410ff37a5ebd74dd33dbfd481d1d182d7c5e762ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-fish-completion"

RDEPENDS:${PN} += "fish \
fwupd"

inherit rpm
