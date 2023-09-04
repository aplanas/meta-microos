SUMMARY = "Documentation for texlive-ieeeconf"
DESCRIPTION = "This package includes the documentation for texlive-ieeeconf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-doc-2023.209.1.4svn59665-54.1.noarch.rpm"
RPM_HASH = "1ca22131190042299e8fe22797b36cd694abb9c4279e8f6cf65cd340da16e824692522813c8c2c71d3ce655719fabad4c712677018353ff346b1dba438bb3bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
