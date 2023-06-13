SUMMARY = "Bash tab-completion for nbdkit"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-bash-completion-1.32.2-1.3.noarch.rpm"
RPM_HASH = "a5c35dea7f78e12bb881f76b7dc54f21b9062dfb16b26bb22fcac30064bd8509087a41a588d57c61697a2d34081412ab1661d414cf88ec10c8b1944610d8c0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nbdkit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nbdkit-server"

inherit rpm
