SUMMARY = "Documentation for texlive-etoc"
DESCRIPTION = "This package includes the documentation for texlive-etoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn66299"

RPM_NAME = "texlive-etoc-doc-2023.209.1.2svn66299-53.1.noarch.rpm"
RPM_HASH = "4422791316f8c1bae45abcc379f5572b68b728b06b210a3e1de8a5583043a88df62e08a406d5d237ce370d97367d2196362c277abd318493531b6603df841bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
