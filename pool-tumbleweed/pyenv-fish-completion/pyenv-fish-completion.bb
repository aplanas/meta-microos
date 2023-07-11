SUMMARY = "Fish completion for pyenv"
DESCRIPTION = "Fish command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.21"

RPM_NAME = "pyenv-fish-completion-2.3.21-1.1.noarch.rpm"
RPM_HASH = "fbc2999dcaf5acdd1733c9f85fbeb561d1055aff91b23e23b54e38606b6a45f6f71d8ef48400a26923d12fc3a25bc72b26df7fc955998d9b5a4bdf98aea66757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-fish-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
