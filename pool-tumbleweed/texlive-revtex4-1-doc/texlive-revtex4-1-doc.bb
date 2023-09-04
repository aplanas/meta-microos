SUMMARY = "Documentation for texlive-revtex4-1"
DESCRIPTION = "This package includes the documentation for texlive-revtex4-1"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-doc-2023.209.4.1ssvn56590-54.2.noarch.rpm"
RPM_HASH = "b545d2b578c1b48b02d0a63b2c6db683f0011bb1e34117d1e5435269109a5ce18bda7aa6636173723e43453ea096f102a273325f012da1073b22c730c209f2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-1-doc"

RDEPENDS:${PN} += ""

inherit rpm
