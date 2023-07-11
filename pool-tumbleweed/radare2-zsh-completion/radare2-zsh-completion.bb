SUMMARY = "ZSH completion for radare2"
DESCRIPTION = "zsh shell completions for radare2."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-zsh-completion-5.8.6-1.2.noarch.rpm"
RPM_HASH = "532d778f1d8372339096b804a6ef65124587f84847b614adac9f39f3e30559ea5bc594a785d8969d314587bdca00e890c4da24b60525a6a23e2fd0f1ee96e30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "radare2-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
