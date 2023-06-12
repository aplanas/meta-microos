SUMMARY = "ZSH completion for pdfgrep"
DESCRIPTION = "zsh shell completions for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-zsh-completion-2.1.2-2.9.noarch.rpm"
RPM_HASH = "48ea8ce88397c0221358258e594bad527cd8308d8d463b221a129ad06d0b26310bd4129bda1f8a014af8996c50a9049312a098aa6ff4eeda60bf3114d63ae06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
