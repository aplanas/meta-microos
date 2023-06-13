SUMMARY = "Fish Completion for fd"
DESCRIPTION = "The official fish completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-fish-completion-8.7.0-1.3.noarch.rpm"
RPM_HASH = "79e001dc5bfe4a4cdc40dfe6d802893e905a38953c6820db44a15ccad1924ed9e2a212b8737410dc74b3b27344563259b8b77af8fa6cfcca4f8fe70f25714d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
