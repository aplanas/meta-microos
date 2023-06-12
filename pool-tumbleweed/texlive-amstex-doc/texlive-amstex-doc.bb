SUMMARY = "Documentation for texlive-amstex"
DESCRIPTION = "This package includes the documentation for texlive-amstex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn66186"

RPM_NAME = "texlive-amstex-doc-2023.201.2.01svn66186-54.1.noarch.rpm"
RPM_HASH = "5059e66471c91bac9f24bef5f7edd97113232341a621a81b2065517a4123c587575ec44d63fea859169daf9b794dbd15884a8e5ac08f4a87bd45054328dafd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(amstex.1) \
texlive-amstex-doc"
RDEPENDS:${PN} += ""

inherit rpm
