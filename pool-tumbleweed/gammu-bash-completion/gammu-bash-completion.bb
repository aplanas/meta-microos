SUMMARY = "Bash completion for gammu"
DESCRIPTION = "This package contains the bash completion command for gammu."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-bash-completion-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "59ac340bec832dfa5f9cdbf85a8e3f9dee55877502cee1f3b2066ea794d1cf88da17b33629165d2cea9af82870119cfbe581a7cb02e0ab0ee35718b8df7d7c9a"

RPROVIDES:${PN} += "gammu-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gammu"

inherit rpm
