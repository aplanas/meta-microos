SUMMARY = "Bash Completion for alacritty"
DESCRIPTION = "The official bash completion script for alacritty. It includes support \
for every argument that can currently be passed to alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "alacritty-bash-completion-0.12.2-1.1.noarch.rpm"
RPM_HASH = "c07bfd29ef140a2824450bf3da7cbcf153289f524ded6046ee37a67f8a828bea06c277c034fc13ad829a36391978f6f4a770a49fd5c34be2752520abc330d2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
