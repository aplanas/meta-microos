SUMMARY = "Zsh Completion for zola"
DESCRIPTION = "Zsh command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-zsh-completion-0.17.2-2.1.noarch.rpm"
RPM_HASH = "c3bf75a41c3bdadf49777b7c1ec5aa37bf50ce327de50f342a247d507cdae561139dbe86436ea95880700cfde52de072997ab23c174cef827cd63bd88893cb7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
