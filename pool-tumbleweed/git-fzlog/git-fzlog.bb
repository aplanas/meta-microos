SUMMARY = "Git log and patch viewer and fuzzy searcher"
DESCRIPTION = "Git log and patch viewer and fuzzy searcher. \
This command provides a two column view with the left column containing the list of commits \
and the right column showing the currently selected commit."
LICENSE = "AGPL-3.0-or-later"

PV = "20230630.55521ba"

RPM_NAME = "git-fzlog-20230630.55521ba-1.1.noarch.rpm"
RPM_HASH = "d0bcbf68899eb851401e4cf74bf88db3efc9366a15a96b31dcc246f2a95583b94c8c72ae4964eb85814af648b86181041a97c69fe2cc2ecc5b0ee925005e018c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-fzlog"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
bat \
fzf \
git"

inherit rpm
