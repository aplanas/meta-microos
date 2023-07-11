SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-logrotate-7.2.5-1.3.noarch.rpm"
RPM_HASH = "2b789f6003fe7da8f39159228ebd6c6e363af171ae0549e3f0857c4e1dca426c8ec845198c2e22d9062436f2eda34b1ebc74c6f7d73094d8df8bac3dd2257acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"

RDEPENDS:${PN} += "logrotate"

inherit rpm
