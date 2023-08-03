SUMMARY = "A glyphs-only version of Nerd Fonts"
DESCRIPTION = "Nerd Fonts takes popular programming fonts and adds a bunch of glyphs. \
This package only contains the symbols without including a base font."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "symbols-only-nerd-fonts-3.0.2-1.1.noarch.rpm"
RPM_HASH = "afa9f0a6cb8e07c39d3d770d24b0c6cdd674c7ad30fea11800fbd4eef0e0bf685fba7252555414f6dd015ed39cedbcb4ddec5f0334e093300870d63254ba891c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "symbols-only-nerd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
