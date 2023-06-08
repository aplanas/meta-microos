SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "gh-2.28.0-1.1.aarch64.rpm"
RPM_HASH = "caf39de5331bf0e5396c66ae687984a9126b57779ae31162c3261b1a46ac955c8c46a96a879819467e6eedef912a95584d4b3704d7da431c7c032207c12955a1"

RPROVIDES:${PN} += "gh gh(aarch-64)"
RDEPENDS:${PN} += "git-core libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
