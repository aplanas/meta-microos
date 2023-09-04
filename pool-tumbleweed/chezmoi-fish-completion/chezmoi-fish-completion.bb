SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.37.0"

RPM_NAME = "chezmoi-fish-completion-2.37.0-1.1.noarch.rpm"
RPM_HASH = "1ddede1210d399b905092b78db95ee7fd41aa094603a00b3cd85f405a21b3c1972e8a0d54e3c323f1998881964ed21e956a472033b726aa8315341a29474f04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
