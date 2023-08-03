SUMMARY = "Documentation for texlive-genealogy"
DESCRIPTION = "This package includes the documentation for texlive-genealogy"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25112"

RPM_NAME = "texlive-genealogy-doc-2023.209.svn25112-53.1.noarch.rpm"
RPM_HASH = "f042d03070527d8623e9c9cec0b6da12e46695828a76c4d06d4e8f08a46a081235b01b1d97bd5c629e07066bea6fe309da9ad19f3e3cd150f4a3b15edff05228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogy-doc"

RDEPENDS:${PN} += ""

inherit rpm
