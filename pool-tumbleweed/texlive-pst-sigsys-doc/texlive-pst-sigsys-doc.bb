SUMMARY = "Documentation for texlive-pst-sigsys"
DESCRIPTION = "This package includes the documentation for texlive-pst-sigsys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-doc-2023.209.1.4svn21667-54.1.noarch.rpm"
RPM_HASH = "cd1f540231c5b36be2b920a007ee232bc4f4ae8bb9b02b94c4d589c213baa3086bc225cc299cb631bdbab1e5d87bacacf71743177295eadb74ab03d2843bffb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sigsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
