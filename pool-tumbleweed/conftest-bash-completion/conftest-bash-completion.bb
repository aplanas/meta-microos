SUMMARY = "Bash Completion for conftest"
DESCRIPTION = "Bash command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.44.1"

RPM_NAME = "conftest-bash-completion-0.44.1-1.1.noarch.rpm"
RPM_HASH = "dc29f09bceb7b8d673b7983e6d731ca1e4e51c8890f9d6ba7f0cda41460ee3bf2474c5664332c4a881b0d8f5631a3ad8e01985c5e1de3828876982e8344cd5e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-bash-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
