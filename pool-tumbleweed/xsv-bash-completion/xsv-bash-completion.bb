SUMMARY = "Bash Completion for xsv"
DESCRIPTION = "Bash completion script for xsv."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-bash-completion-0.13.0-2.8.noarch.rpm"
RPM_HASH = "751fb50996848bba9f3e322bc743a2758140fd64a02689650a3910c4089d98ba617c81e777f619d1dcb8262721639d6d8f4f74c7968e679d243e328659ceadcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
xsv"

inherit rpm
