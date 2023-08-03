SUMMARY = "Documentation for texlive-pmhanguljamo"
DESCRIPTION = "This package includes the documentation for texlive-pmhanguljamo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn66361"

RPM_NAME = "texlive-pmhanguljamo-doc-2023.209.1.0.2svn66361-53.1.noarch.rpm"
RPM_HASH = "06648e73d97b9fc3a848dcf570d770a96d4752f6d8114e2a23725aae0aff2a827a3bf20058181e8a100a8833bbdab462a6691eee6c7d981682564a84da123599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pmhanguljamo-doc-ko \
texlive-pmhanguljamo-doc"

RDEPENDS:${PN} += ""

inherit rpm
