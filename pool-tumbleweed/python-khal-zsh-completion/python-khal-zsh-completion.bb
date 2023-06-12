SUMMARY = "ZSH completion for khal"
DESCRIPTION = "zsh shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-zsh-completion-0.10.5-3.4.noarch.rpm"
RPM_HASH = "a29b33c2496c7f997ff08c959c91b76b2819d0410412897ef87ecf46501e929012c8770ac5073593b513a82d0ab8110ea942bea55507a3d24d63b1e9e3c9b2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
