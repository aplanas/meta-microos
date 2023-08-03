SUMMARY = "Zsh Completion for fnott"
DESCRIPTION = "Zsh command-line completion support for fnott"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "fnott-zsh-completion-1.4.1-1.1.noarch.rpm"
RPM_HASH = "7e33f5a090398fd9030ab0af91c8919ac042fb243877556def772e5653c3272bbe56d417ee1de8e0c1a753bdf880e3197ed6b31636abfcd0138f7a7d5b7147c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnott-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
