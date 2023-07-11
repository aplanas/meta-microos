SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-zsh-completion-4.5.3-1.2.noarch.rpm"
RPM_HASH = "29e6430d8121487e424dcd9937e3209f72c1d108cda8b0c1d83725008bbbb5d92532815577a3036f9fcc6d8e9e3105eddb0b70532bbf8aa3da35ab3e6fb7dd36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
