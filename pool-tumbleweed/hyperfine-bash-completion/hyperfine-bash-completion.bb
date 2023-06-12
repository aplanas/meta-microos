SUMMARY = "Bash Completion for hyperfine"
DESCRIPTION = "The official bash completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.16.1"

RPM_NAME = "hyperfine-bash-completion-1.16.1-1.1.noarch.rpm"
RPM_HASH = "6b408f6379432344c96aa0a9d11983cdbe0a21c941961277dd8783a22f4fe0452d1bccdc0e1210780536885f652ce40f9ddb515e14e9fa9069b36dc848dc66dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
