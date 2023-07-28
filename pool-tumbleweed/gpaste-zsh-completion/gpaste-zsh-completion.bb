SUMMARY = "Zsh tab-completion for gpaste"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
This package provides zsh tab-completion for gpaste."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "gpaste-zsh-completion-44.1-1.1.noarch.rpm"
RPM_HASH = "e78c76173cb4c5753300b47cf8d130a604c62962b5e8ceb87ef27d3d0135b0c7373d9692a7a0eb66b8c6f6859c96335677d4c475440417f0f553a9721851c9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
