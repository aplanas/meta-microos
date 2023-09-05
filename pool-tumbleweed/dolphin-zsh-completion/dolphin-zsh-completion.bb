SUMMARY = "ZSH completion for dolphin"
DESCRIPTION = "ZSH command line completion support for dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "dolphin-zsh-completion-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ca70c730165372a94f52a3032efbea260de7168839802bdea1610e6174f1ab554d416afee3a7dee86f9fa9260eb3f68c96f64eb33234dcf50e93cfb68a2f3d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-zsh-completion"

RDEPENDS:${PN} += "dolphin"

inherit rpm
