SUMMARY = "Bash Completion for typst"
DESCRIPTION = "Bash command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "typst-bash-completion-0.6.0-1.1.noarch.rpm"
RPM_HASH = "66ca58cff8de7aee8f788304fdba66b718a3b7679af09020ec80f48d7dd37eec20cf79db6aacc4e1958b61f52f1b7f425b9f836fd17040c9f838673b8473b0da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
