SUMMARY = "Documentation for texlive-epstopdf"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.31svn66461"

RPM_NAME = "texlive-epstopdf-doc-2023.209.2.31svn66461-54.1.noarch.rpm"
RPM_HASH = "66c26cff09e2da02b9f8ebe2fc2803c8f73181a75ee3ca21674c4a8d881514240030d55c7509d9067066e80b78ef5023a4ea4a26a53474574519ced9344162ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-epstopdf.1 \
man-repstopdf.1 \
texlive-epstopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
