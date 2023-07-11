SUMMARY = "Bash Completion for swww"
DESCRIPTION = "Bash command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-bash-completion-0.7.3-1.2.noarch.rpm"
RPM_HASH = "f9fa5ac69066b23f7cb3c7e416166e840d82841afe741bbf247683cad84150a00dddd0561bbbe2a118c486af99adf06e9ff5ce2fa3c90e571876f62eb3031fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
