SUMMARY = "Zsh Completion for conftest"
DESCRIPTION = "Zsh command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "conftest-zsh-completion-0.43.1-1.1.noarch.rpm"
RPM_HASH = "c0a7babd4229ca1f901a3025c6f397fbbbaab086d2ccae72339332a7c27b181e99e644529259ed1560fd3711a945a3035e6f54c222b7ec3a6e11eb508b666836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-zsh-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
