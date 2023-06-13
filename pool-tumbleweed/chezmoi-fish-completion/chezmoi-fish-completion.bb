SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.6"

RPM_NAME = "chezmoi-fish-completion-2.33.6-1.1.noarch.rpm"
RPM_HASH = "fae4f7cd8669225f18e22b9ea996cb32e0a0f4cce823ec27b4770b3cc2a782af4ad2435078def76e22d521c7bc3b482d138d8c7c878a8347252bbe257ca20bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
