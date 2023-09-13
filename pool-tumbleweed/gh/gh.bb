SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.34.0"

RPM_NAME = "gh-2.34.0-1.1.aarch64.rpm"
RPM_HASH = "8f7b752fc460a06fddd6d8c0d335e2120acd5c0b1d8c3eda84d84ca0781d8cc785de658fd92c13395465506694dfe8dd87dc6bc6ef3d832087f4bc015cac7002"

RPROVIDES:${PN} += "gh"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
