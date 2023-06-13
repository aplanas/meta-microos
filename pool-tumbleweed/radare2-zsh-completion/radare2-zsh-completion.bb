SUMMARY = "ZSH completion for radare2"
DESCRIPTION = "zsh shell completions for radare2."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-zsh-completion-5.8.6-1.1.noarch.rpm"
RPM_HASH = "cf8f4351d5923e086f8296c38a2daa22ca1cbd182b4f37414a3077d8abd0ce501ab5eb7a5d3297464e32317c1e2abca40890cb3638f8232528697fefa79258b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "radare2-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
