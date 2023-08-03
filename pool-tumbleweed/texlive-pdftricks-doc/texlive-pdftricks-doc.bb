SUMMARY = "Documentation for texlive-pdftricks"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.16svn15878"

RPM_NAME = "texlive-pdftricks-doc-2023.209.1.16svn15878-52.1.noarch.rpm"
RPM_HASH = "35516443a3ab181981d02f3e74b520b45a78f8be38eb6d09b7a88f33004fc3acc7cb01ef56e425262ea9d331bfec5fa3f326c712a1bf0e22e9c788231b7c1a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
