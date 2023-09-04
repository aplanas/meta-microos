SUMMARY = "Documentation for texlive-ecc"
DESCRIPTION = "This package includes the documentation for texlive-ecc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ecc-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "75c29ece48c29539f4ac25c3e5252cc8a5db5fbb26e751918bf0d73985c9eea8bd023e3e2ff8b316cfa94212b3589c89413deacc8adccf71ea5d50418683b16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecc-doc"

RDEPENDS:${PN} += ""

inherit rpm
