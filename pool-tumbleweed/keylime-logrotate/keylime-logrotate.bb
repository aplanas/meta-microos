SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-logrotate-7.0.0-2.1.noarch.rpm"
RPM_HASH = "a7518665ae1ec25c10d5b86e774d680b7074e3713ec7c0e96358af8b88d589a219f01d3ac1d113d13dcd28a13154681415ddea955fc8c55093a66ffb341c8cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"
RDEPENDS:${PN} += "logrotate"

inherit rpm
