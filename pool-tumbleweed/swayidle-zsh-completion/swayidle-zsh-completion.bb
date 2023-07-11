SUMMARY = "Zsh completion for swayidle"
DESCRIPTION = "Zsh command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-zsh-completion-1.8.0-1.3.noarch.rpm"
RPM_HASH = "78f8e619c659ae2faece0b2f89490e4772e17fe310650efc104c265ce522a079861bd733d15c24de5a4433c1cad21df168af71f26cc524da0546dd5bbf2d8fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-zsh-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
