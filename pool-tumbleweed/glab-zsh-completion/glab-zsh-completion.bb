SUMMARY = "Zsh completion for glab"
DESCRIPTION = "Zsh command line completion support for glab."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "glab-zsh-completion-1.32.0-1.1.noarch.rpm"
RPM_HASH = "fc2f54fcd60ef814f7230a73f8764bed6ec92f13ed3750248c7076d7185cb8f09121446611eea53eee5c593d7ee54b188d4a176fddf2dd87b5f1325b59d889ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-zsh-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
