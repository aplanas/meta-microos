SUMMARY = "Documentation for texlive-register"
DESCRIPTION = "This package includes the documentation for texlive-register"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn54485"

RPM_NAME = "texlive-register-doc-2023.201.2.0svn54485-53.1.noarch.rpm"
RPM_HASH = "b68e758d649e6f3ba79219e19612bec6c2a3ad010f0ef5cb281cc8c5186e9f5b5a79ce37dbf3dbf19cb910b1ff84efd88cd407413384487eaa27d74460856889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Reg_macro) \
texlive-register-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
