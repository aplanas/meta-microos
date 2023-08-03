SUMMARY = "Documentation for texlive-datetime2-english"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-english"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-doc-2023.209.1.05svn52479-53.1.noarch.rpm"
RPM_HASH = "5b28b31ce1829ccb72d207a96d7e8b2c3c4d038c7468f7531a92d583f47ab779d2b5dbf92b4e68f8de77f7a23fb18d687c9812331cf5e2197178b9efed5951af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
