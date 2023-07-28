SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.35.0"

RPM_NAME = "chezmoi-fish-completion-2.35.0-1.1.noarch.rpm"
RPM_HASH = "3bf354bca8a9bf108781641b9346d4607da64742fdb9e19244b86d89d3f73a90385a44ff42d220acb490f471c64bc84a63ef7bda1f96b38920d8e4af076912fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
