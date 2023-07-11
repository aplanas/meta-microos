SUMMARY = "Mk-configure documentation"
DESCRIPTION = "Mk-configure package: examples and presentation."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.38.2"

RPM_NAME = "mk-configure-doc-0.38.2-1.3.noarch.rpm"
RPM_HASH = "719431559bf8194974f55254577bfc2078ea25c770eca49536693f476e8f85453ad149288ab532a49630640d9596754610021664e202cfcddd6665c5ed928dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure-doc"

RDEPENDS:${PN} += "mk-configure"

inherit rpm
