SUMMARY = "Bash Completion for ripgrep"
DESCRIPTION = "The official bash completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-bash-completion-13.0.0-5.4.noarch.rpm"
RPM_HASH = "30e80e683fcf8090aba97808882d61dc0b1b054111f51aec4df6b8272ca2d1e37f8611eda3f094d653d903f2a0043c012f348fad74186a962485948aedabb841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
