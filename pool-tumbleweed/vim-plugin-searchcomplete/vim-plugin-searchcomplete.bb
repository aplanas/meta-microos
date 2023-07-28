SUMMARY = "Tab completion of words inside of a search"
DESCRIPTION = "This plugin allows to tab-complete words while typing in a \
search ('/')."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "vim-plugin-searchcomplete-1.1-56.1.noarch.rpm"
RPM_HASH = "687eb209abe578918bd479c1237dda23c76e23b3868e83df07dae3358fb8916f25a56e58043cf42b1a806245208cfca9b7eb4ac1a0d19b66eb196cadef35fb4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-searchcomplete"

RDEPENDS:${PN} += "vim"

inherit rpm
