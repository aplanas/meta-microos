SUMMARY = "Bash Completion for powerstat"
DESCRIPTION = "Bash completion script for powerstat."
LICENSE = "GPL-2.0-only"

PV = "0.03.03"

RPM_NAME = "powerstat-bash-completion-0.03.03-1.1.noarch.rpm"
RPM_HASH = "84a0193d99e23b9bebcb74f97a89aa200442fa9611c2e9a183f2c380f74059d40705150af4291d2bca9e9a5739c80252721cf2d36d9d65822fd0432112ce3506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
powerstat"

inherit rpm
