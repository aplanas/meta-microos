SUMMARY = "Bash tab-completion for libnbd"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd-bash-completion-1.14.1-2.2.noarch.rpm"
RPM_HASH = "dbac99c24fa66b3a04def5c2c14e5ab77033c8bdaee33e1143a53eeb1bcf75042e6acf09b2b992ffbdee2094bac4249c7e5b32ccb861deedba7189e356d0c4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnbd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
libnbd0"

inherit rpm
