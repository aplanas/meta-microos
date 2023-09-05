SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.38.0"

RPM_NAME = "chezmoi-fish-completion-2.38.0-1.1.noarch.rpm"
RPM_HASH = "622ef0a0ac6f6b200d1b5d8ed65e13842b3983ed8e84bceda7fa29ab736c78ee8607989aebccd1bdc71c892de09e0434a64615d0bbbdc3619effac1387323d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
