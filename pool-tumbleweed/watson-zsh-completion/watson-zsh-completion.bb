SUMMARY = "Zsh completion for watson"
DESCRIPTION = "Zsh command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-zsh-completion-2.1.0-1.4.noarch.rpm"
RPM_HASH = "39af79e449fd12102958adfe6c2cc73b26795309c1934dc13a3ba819219a1e21af7d429100c2483c82f63b55adc8c34e043690d9bd2169a4ee3f3d50e61f70ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-zsh-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
