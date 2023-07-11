SUMMARY = "Zsh Completion for zola"
DESCRIPTION = "Zsh command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-zsh-completion-0.17.2-2.2.noarch.rpm"
RPM_HASH = "a796dd402a81c810e5df930c7a3ac65b1a510d92aa0d058272d02d0d92aef425568b440fded4afbbf1909130f791c5501bbbb951c5290b1f88cbcc44e1efe289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
