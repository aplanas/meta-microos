SUMMARY = "Bash Completion for tio"
DESCRIPTION = "Bash completion script for tio."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "tio-bash-completion-2.5-1.2.noarch.rpm"
RPM_HASH = "e059ca45a39ae15905d7985fd0b8b3bd0e3c8da22c09e47ff9d7f72ecd8b89e7826db098a071865052d318db9d1485094e5a3df6f9ee8cd5af2a4419bc27c982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tio"

inherit rpm
