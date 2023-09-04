SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.6.8"

RPM_NAME = "fde-tools-bash-completion-0.6.8-1.1.noarch.rpm"
RPM_HASH = "d687e3a23c0b7bfbf19235c13fe8b10268d7b4ad28bd9ca3bb4b7332a6ff6be212d671272fb701ac4b35c23afcce363e4b96125c9fb56280218a99d13ac4f49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm
