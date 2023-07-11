SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.31.0"

RPM_NAME = "gh-2.31.0-1.1.aarch64.rpm"
RPM_HASH = "4a5b1fe1aec2e4a3698f2f27a6f074eef623210986a60c2467f343ccf749488f3b3b2db9d691cf7dd1e1f1c8157a5c493c4c1e20a014b5ba73f9e512f976d440"

RPROVIDES:${PN} += "gh"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
