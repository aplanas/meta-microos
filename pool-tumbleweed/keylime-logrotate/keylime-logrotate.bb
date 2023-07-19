SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-logrotate-7.3.0-1.1.noarch.rpm"
RPM_HASH = "a38c1e0af96ac7e7f332024b9a96f3adfa733841d31f9539231cb1bb91b49feaadc6e3e1ce45834c84d023661bf904e1750de001a807d5e41b6d6a89a46c494e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"

RDEPENDS:${PN} += "logrotate"

inherit rpm
