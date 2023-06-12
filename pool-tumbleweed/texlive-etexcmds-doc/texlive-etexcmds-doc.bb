SUMMARY = "Documentation for texlive-etexcmds"
DESCRIPTION = "This package includes the documentation for texlive-etexcmds"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn53171"

RPM_NAME = "texlive-etexcmds-doc-2023.201.1.7svn53171-52.1.noarch.rpm"
RPM_HASH = "6637200cdb21c08706beeea88f9dc3c6bddeaea0962611bcfc26966bd9e5e8fc4e5bdbb0b1ad251a56a84e511c0d1980ff0497c40578bcc1d87a1481d38f1486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etexcmds-doc"
RDEPENDS:${PN} += ""

inherit rpm
