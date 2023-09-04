SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.33.0"

RPM_NAME = "gh-bash-completion-2.33.0-1.1.aarch64.rpm"
RPM_HASH = "84140fdff717d9679426883086768a1b769447c5931153d0430a4645438943c7d377acb8822d02c8f131329a59cdb2b3b87b4a5d1bc331ab62e5b8b29380b463"

RPROVIDES:${PN} += "gh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gh"

inherit rpm
