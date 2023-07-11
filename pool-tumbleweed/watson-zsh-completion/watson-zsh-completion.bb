SUMMARY = "Zsh completion for watson"
DESCRIPTION = "Zsh command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-zsh-completion-2.1.0-1.5.noarch.rpm"
RPM_HASH = "459d7f1c2bbb561101d8e1ba2e7673555a099cc3389589da7e56f2fcb1e129dfac78fe4533f6de885a71874b211f1b027d9e418927ef6691008cf3925d357f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-zsh-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
