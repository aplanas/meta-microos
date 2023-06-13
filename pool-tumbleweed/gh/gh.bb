SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.30.0"

RPM_NAME = "gh-2.30.0-1.1.aarch64.rpm"
RPM_HASH = "b57acf41633add1ff53d12c010b9fcdd934b140bfc6969ccbfc4df109906212595d3fb377799b368ed698c8e28664f95a3bb3d02896caed8da21668144b5f5cc"

RPROVIDES:${PN} += "gh \
gh(aarch-64)"

RDEPENDS:${PN} += "git-core \
libc.so.6()(64bit)"

inherit rpm
