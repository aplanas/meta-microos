SUMMARY = "Bash Completion for rainbow"
DESCRIPTION = "Bash completion script for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-bash-completion-2.8.0-1.5.noarch.rpm"
RPM_HASH = "f7652d2047053ddbc1b6f2275b9055dd866dcc9a970656aace4233fcb48d99d37f3e3fc70d564386d04387a399dd37d6450440e40fd481ca16ed9bd2a316508d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rainbow-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rainbow"

inherit rpm
