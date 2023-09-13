SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.39.1"

RPM_NAME = "chezmoi-fish-completion-2.39.1-1.1.noarch.rpm"
RPM_HASH = "83572f7d171c1bb8136273a25f064543c1cd60b13e85201ae3f243e31c7e6a55fdd34a95d9f19569040a5a2fb7f2063d417605e40d1441a7dbd69ba9e753039e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
