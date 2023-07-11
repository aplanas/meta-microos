SUMMARY = "Documentation for texlive-m-tx"
DESCRIPTION = "This package includes the documentation for texlive-m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.63dsvn64182"

RPM_NAME = "texlive-m-tx-doc-2023.208.0.0.63dsvn64182-53.1.noarch.rpm"
RPM_HASH = "fed0277c1756b1891a675684641bfe50c67216e22f307ab300abffc291d942eddcfa00f3b00a0647b0d0e95c513c2045bfa62e91ecdd90441618f0678af3e73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-prepmx.1 \
texlive-m-tx-doc"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua"

inherit rpm
