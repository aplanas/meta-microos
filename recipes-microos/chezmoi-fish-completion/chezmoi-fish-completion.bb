SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.4"

RPM_NAME = "chezmoi-fish-completion-2.33.4-1.1.noarch.rpm"
RPM_HASH = "aa99f416c8e043f7cc63178c8d19dd11edd7fab43d018902032e036d65665d416658b0c1a0f489f1e33a05c1e9c3a2c89de473a72d0d0948c0635fb23fc9bf98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"
RDEPENDS:${PN} += "chezmoi"

inherit rpm
