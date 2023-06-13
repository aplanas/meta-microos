SUMMARY = "Documentation for texlive-practicalreports"
DESCRIPTION = "This package includes the documentation for texlive-practicalreports"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-doc-2023.201.2.0.3svn52312-52.1.noarch.rpm"
RPM_HASH = "22892b9c93171057e986775b67321068c2ef45ee7cfd341151715e75d1960d220d5e4edf9117ccaee5b901d682bc1b125a8d94dcacd4507fe36ad56163ed77af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-practicalreports-doc"

RDEPENDS:${PN} += ""

inherit rpm
