SUMMARY = "Fish completion for pyenv"
DESCRIPTION = "Fish command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.17"

RPM_NAME = "pyenv-fish-completion-2.3.17-1.1.noarch.rpm"
RPM_HASH = "bad5739f09b5b9951eb47a5ad9ac49ac2f09d68b7e4b8c1ca71f177414882c05babf61ff62cebf5fdb8b13a71c70d9c0a93adb97adb241061dfaa246975cfe88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-fish-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
