SUMMARY = "Bash tab-completion for nbdkit"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-bash-completion-1.32.2-1.4.noarch.rpm"
RPM_HASH = "644fcaadc08c6d5822dbb2f4ebf2ba6503d70cf39bdc58f5b54587cb1f1631f918df09eca3ac5b61892a6aa05da7dbd2d95d240ad83d977e924ffe6828eefa81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nbdkit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nbdkit-server"

inherit rpm
