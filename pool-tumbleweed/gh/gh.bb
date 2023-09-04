SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.33.0"

RPM_NAME = "gh-2.33.0-1.1.aarch64.rpm"
RPM_HASH = "31534ad04166ce1562aa63ace997ed397171eb35f5f355387dbd59b6c5528c95638dcdc7d1761be6dca8bf216dfad73486561b68ae355d5e8e2efdb4b350d9c4"

RPROVIDES:${PN} += "gh"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
