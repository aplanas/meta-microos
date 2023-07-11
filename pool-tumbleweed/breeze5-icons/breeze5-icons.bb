SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "breeze5-icons-5.107.0-1.1.noarch.rpm"
RPM_HASH = "10aafb96941c3982a795e32eee6122d2ec9c1f6eb131ffa860718ce05d0c51f31a42f394d42ffacd2da113336af2549b97621d27eca75987cc1931f9d1d25561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
