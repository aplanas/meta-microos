SUMMARY = "Documentation for texlive-utf8add"
DESCRIPTION = "This package includes the documentation for texlive-utf8add"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61074"

RPM_NAME = "texlive-utf8add-doc-2023.201.svn61074-53.1.noarch.rpm"
RPM_HASH = "9fc4f097ef2a4299c8947fd00c39cc75b1bf7a50ad3864f7c924361928686e2c6c2b42e6a64936d4f21d50557f09a0d2607515949bf2f85e21562c1e446dfb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8add-doc"

RDEPENDS:${PN} += ""

inherit rpm
