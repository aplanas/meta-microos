SUMMARY = "Zsh completion for swayidle"
DESCRIPTION = "Zsh command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-zsh-completion-1.8.0-1.2.noarch.rpm"
RPM_HASH = "1c5a062826891e061e0e7e37ab9c773dff084ea6fd970e263436ab907a6064c9855bc2cca9a8a5bf018d6aabe9e512000724f98a2a89a3e24bd561e75360b0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-zsh-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
