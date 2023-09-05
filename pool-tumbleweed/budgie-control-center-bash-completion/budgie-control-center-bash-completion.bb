SUMMARY = "Bash Completion for Budgie Control Center"
DESCRIPTION = "This package contains the Bash Completion for Budgie Control Center"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0+0"

RPM_NAME = "budgie-control-center-bash-completion-1.3.0+0-1.1.aarch64.rpm"
RPM_HASH = "fc4b322574e74c81b5df34daeca2d997135643064cdb49dfabd9b9df7424e8cb4730037653c51ed688c3baeed7605c915d42ab61bf9c20d37f3fd17d207765c5"

RPROVIDES:${PN} += "budgie-control-center-bash-completion"

RDEPENDS:${PN} += "bash-completion \
budgie-control-center"

inherit rpm
