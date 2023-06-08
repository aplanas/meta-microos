SUMMARY = "Zsh completion for ansifilter"
DESCRIPTION = "This package provides Zsh command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-zsh-completion-2.19-1.3.noarch.rpm"
RPM_HASH = "468f6e68c96cfb2df1674525f1d3646b8ee1590f71383ce01b3569e42192c0519b1d50803b3c9233293bcde3ec16218559614e8d68fad4213d5b70676b4faa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-zsh-completion"
RDEPENDS:${PN} += "ansifilter zsh"

inherit rpm
