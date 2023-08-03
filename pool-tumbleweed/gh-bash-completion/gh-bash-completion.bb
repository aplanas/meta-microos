SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.32.1"

RPM_NAME = "gh-bash-completion-2.32.1-1.1.aarch64.rpm"
RPM_HASH = "f89e9fdbc385861c7b9f11bd72f87197d632f3fdf6eefe1299a95fa277c9716a869a5cb8fc9e59e08bc7cd46c36391fa54eb91add44f48abb8387ebebdedac41"

RPROVIDES:${PN} += "gh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gh"

inherit rpm
