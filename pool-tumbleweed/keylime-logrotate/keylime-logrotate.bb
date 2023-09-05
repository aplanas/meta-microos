SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-logrotate-7.5.0-1.1.noarch.rpm"
RPM_HASH = "fc74d23ec252ca4864a7b3949cb786aa92b575ee334c4ef638870535e709387c12d76472d5f06bb4fc6bd97b531aa36880e6dee7959ad83a0f6f692f5e350533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"

RDEPENDS:${PN} += "logrotate"

inherit rpm
