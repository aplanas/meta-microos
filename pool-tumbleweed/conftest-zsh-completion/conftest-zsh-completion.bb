SUMMARY = "Zsh Completion for conftest"
DESCRIPTION = "Zsh command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.45.0"

RPM_NAME = "conftest-zsh-completion-0.45.0-1.1.noarch.rpm"
RPM_HASH = "c6d9db81a746cc320a5f5bbb032b1804347b1280cb9700998ce69d89cb5457583e543cfc00765ee3b82d1b924ed1a1fa05796834330ecc1c2866c18f62029ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-zsh-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
