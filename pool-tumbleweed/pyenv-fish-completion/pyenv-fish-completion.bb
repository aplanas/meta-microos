SUMMARY = "Fish completion for pyenv"
DESCRIPTION = "Fish command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.25"

RPM_NAME = "pyenv-fish-completion-2.3.25-1.1.noarch.rpm"
RPM_HASH = "4600f9bf4fbe443a7fc930a93c10f81d7a5b24b0fba3ce2d37263af18133ab4bf15d7b3b9edf98e68dbc3441fee4227c63f43967286ad19eb6cd61b96ec816b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-fish-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
