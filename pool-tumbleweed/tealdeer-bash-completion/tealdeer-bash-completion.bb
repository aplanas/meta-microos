SUMMARY = "Bash Completion for tealdeer"
DESCRIPTION = "Bash command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-bash-completion-1.6.1-2.3.noarch.rpm"
RPM_HASH = "b43c5785509712d046b1e1978cfd942ad924de6f9b55b5751d89c197043869f2d9cba1e12b7812d1d3404f40cd30e0071ac2f3f5984263bbf50f36abb97434ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
