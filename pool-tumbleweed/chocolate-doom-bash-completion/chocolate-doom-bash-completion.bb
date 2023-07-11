SUMMARY = "Chocolate Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support chocolate-doom."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "chocolate-doom-bash-completion-3.0.1-3.2.noarch.rpm"
RPM_HASH = "3f7f64365455f45f66455da67f1a9e19509bd3aaa2186622505b9ce82c3c1376e4df1941eeaa2f9f73b8d470f31bf0647e592c384b7e5de68ead6874bd3fc636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chocolate-doom-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
