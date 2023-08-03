SUMMARY = "Git log and patch viewer and fuzzy searcher"
DESCRIPTION = "Git log and patch viewer and fuzzy searcher. \
This command provides a two column view with the left column containing the list of commits \
and the right column showing the currently selected commit."
LICENSE = "AGPL-3.0-or-later"

PV = "20230725.997a813"

RPM_NAME = "git-fzlog-20230725.997a813-1.1.noarch.rpm"
RPM_HASH = "7bd47fc936f286e373364085a50bf059c97929ffb01a42f8ad4e4589706cf1a9a89f4da12d34501fb53b12338300e956f3514b691d3e06c1fbb499d83373d9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-fzlog"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
bat \
fzf \
git"

inherit rpm
