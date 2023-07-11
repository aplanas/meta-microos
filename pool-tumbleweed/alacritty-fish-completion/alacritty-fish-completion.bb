SUMMARY = "Fish Completion for alacritty"
DESCRIPTION = "The official fish completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "alacritty-fish-completion-0.12.2-1.1.noarch.rpm"
RPM_HASH = "3f21f15c8a37f50701bbeb9a391d263f68e5506172a703256662a44aa424ed5e33fd8104403665d14de6cb094f433883a97c55615b5a9b34fce49a262d82d61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
