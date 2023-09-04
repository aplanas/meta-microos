SUMMARY = "Documentation for texlive-hpsdiss"
DESCRIPTION = "This package includes the documentation for texlive-hpsdiss"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "1403df942886f336a1cf754a608572582f51a99be62d47a9fd1439135aaa4cb1c9e2730e029134909bcd784833328fa728c304b05176d00638271b94a51c11be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hpsdiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
