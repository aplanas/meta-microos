SUMMARY = "Documentation for texlive-texdraw"
DESCRIPTION = "This package includes the documentation for texlive-texdraw"
LICENSE = "LPPL-1.0"

PV = "2023.209.v2r3svn64477"

RPM_NAME = "texlive-texdraw-doc-2023.209.v2r3svn64477-55.1.noarch.rpm"
RPM_HASH = "fa98044dbdc8cee8434fa9df0c978e42c7511d8a2189e7499282d3f385e260aa317006e44c364435e3faa017edd0e3922ea757b1368194773dc741f575e77d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdraw-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
