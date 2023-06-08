SUMMARY = "Integration tests for AutoYaST2"
DESCRIPTION = "Profiles and test scripts for AutoYaST2 integration tests. \
For internal testing purposes only! Not useful on a real system!"
LICENSE = "GPL-3.0-only"

PV = "1.2.40"

RPM_NAME = "aytests-tests-1.2.40-1.11.noarch.rpm"
RPM_HASH = "7f24b6bdde8bad6291db2d0e4fe27019934c910ce3bfbdf0e6fdf150e16a9181247bda18f069fbd38a2b5532c57e58c209167b79bf94ef4a442b1a6681d3b8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aytests-tests"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
