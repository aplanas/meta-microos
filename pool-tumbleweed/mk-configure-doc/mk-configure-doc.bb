SUMMARY = "Mk-configure documentation"
DESCRIPTION = "Mk-configure package: examples and presentation."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.38.2"

RPM_NAME = "mk-configure-doc-0.38.2-1.2.noarch.rpm"
RPM_HASH = "f6c0b93e16cf61a014629d177637565286362b20674f5917c5d1ddaba2b0bd6e60e2f1936006c92a95721278c26199965b09b40bf4dc6c5b3ba6dd171558c5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure-doc"

RDEPENDS:${PN} += "mk-configure"

inherit rpm
