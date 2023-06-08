SUMMARY = "Bash Completion for fd"
DESCRIPTION = "The official bash completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-bash-completion-8.7.0-1.3.noarch.rpm"
RPM_HASH = "4b12edb8c2cfa666a573d67eb3267b083ac46d8024850d98d73b2d555bac1e5b5b36c6c90abd8c88a83980bf0932704880f43bcf076ec835b198191899cb9cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
