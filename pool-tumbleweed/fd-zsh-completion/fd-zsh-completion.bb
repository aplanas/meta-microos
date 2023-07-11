SUMMARY = "ZSH Completion for fd"
DESCRIPTION = "The official zsh completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-zsh-completion-8.7.0-1.4.noarch.rpm"
RPM_HASH = "41e0483d3e6dc7af02be4ec7cc1322df382d482cf391f091c91f38614dbfbd0427ad18964ec1065eec4b5ea433e8f4eaae036e99313f214b0c0ec9709d096652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
