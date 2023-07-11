SUMMARY = "ZSH completion for flameshot"
DESCRIPTION = "zsh shell completions for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-zsh-completion-12.1.0-2.2.noarch.rpm"
RPM_HASH = "a38868d67708c67b75e664d0be43e377425f4a87f770c6ef788a011b840ae72c620ba93c4f51fcdb071975cacbc23473e5f3cc0ccc5a47f457019a65dce7886b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-zsh-completion"

RDEPENDS:${PN} += "flameshot"

inherit rpm
