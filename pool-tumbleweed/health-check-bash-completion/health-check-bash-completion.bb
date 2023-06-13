SUMMARY = "Bash Completion for health-check"
DESCRIPTION = "Bash completion script for health-check."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-bash-completion-0.03.09-1.11.noarch.rpm"
RPM_HASH = "953e3446186f19319f276a639381ba0e31ff337e5d5c6bec75d677c1da790625749e19df5e424f612022a351c3b79bf177fe099ec49ac86592151d2baaadbfda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-check-bash-completion"

RDEPENDS:${PN} += "bash-completion \
health-check"

inherit rpm
