SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-tools-bash-completion-0.6.5-2.1.noarch.rpm"
RPM_HASH = "629ff809ccf76dd89edb23f5c5cd0f6307e5b41c621a21b92c062e354a77fbf4346ae7449409d0d34e2ce21fcd5a47b50dc0d80bf100351612239ea7951679ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm
