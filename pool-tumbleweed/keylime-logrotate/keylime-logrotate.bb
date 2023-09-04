SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-logrotate-7.4.0-1.1.noarch.rpm"
RPM_HASH = "59f3ea9ee173843a2845d4bc5d700d3227d49959548f75d17a16fff6ef7fc79808ff670a55d95cd8db7d01514b7bc0cb656d9f4106f217009be337d108c7d48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"

RDEPENDS:${PN} += "logrotate"

inherit rpm
