SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.32.1"

RPM_NAME = "gh-2.32.1-1.1.aarch64.rpm"
RPM_HASH = "f613e7ff8317ed00d148cac2b636e56e7281d2e340d671e19ebdc1aae1979ac8dcd5b539d339ac71ce2736bf897aad578e4017596fa313fe75b4806de2a67ebe"

RPROVIDES:${PN} += "gh"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
