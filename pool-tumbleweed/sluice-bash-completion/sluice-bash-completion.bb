SUMMARY = "Bash Completion for sluice"
DESCRIPTION = "Bash completion script for sluice."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "sluice-bash-completion-0.02.13-1.8.noarch.rpm"
RPM_HASH = "5dd1216d0f005d5621025987552c8c2a781e9f778c902f7fa2df341bdb00ef6915b471ae72463fe15994e4656052eb27a5bafbc20bea47ae6aad73c80ca8e84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sluice-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sluice"

inherit rpm
