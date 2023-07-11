SUMMARY = "Bash Completion for xca"
DESCRIPTION = "Bash completion script for xca."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "xca-bash-completion-2.4.0-2.4.noarch.rpm"
RPM_HASH = "4819efc0a9ff5209aeb9fdce38dacc326760f97243aec7467665756a3ead2aebcf978824d2608e75b897b20eef25d766598801cf863bb95f6352cbec2f93ac0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xca-bash-completion"

RDEPENDS:${PN} += "bash-completion \
xca"

inherit rpm
