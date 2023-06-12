SUMMARY = "Bash completion for android-tools"
DESCRIPTION = "Bash command line completion support for android-tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-bash-completion-34.0.1-1.1.noarch.rpm"
RPM_HASH = "9eda34bc5b86a21732ce0f9d0aad5c7a40cb9d2eb38e16681ed60a4e88871f36e5bc00daa27434d8dc4297d6e72ce163055690281864c2169a5ff71fe48bf303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
