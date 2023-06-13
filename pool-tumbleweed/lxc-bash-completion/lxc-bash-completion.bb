SUMMARY = "Bash Completion for lxc"
DESCRIPTION = "Bash command line completion support for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-bash-completion-5.0.2-1.1.noarch.rpm"
RPM_HASH = "01547568ef29f802bcc35951e799dee629d9cefd49b5b14863ed91adbbe9e7638409b57abb7cc08186fbb106f14ac3dc6bc1aa6fa2529ee74653829e2ac5136a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-bash-completion"

RDEPENDS:${PN} += "lxc"

inherit rpm
