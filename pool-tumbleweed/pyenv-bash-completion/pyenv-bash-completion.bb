SUMMARY = "Bash completion for pyenv"
DESCRIPTION = "Bash command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.22"

RPM_NAME = "pyenv-bash-completion-2.3.22-1.1.noarch.rpm"
RPM_HASH = "e065d7ab4b13ef3dd5f6baf98e82790f51b249bec8f51dabc1095e8bfd6291b5b8682bb3955eda25587f676c1669828e6476f87fea2b506801d323a8c2aa7a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-bash-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
