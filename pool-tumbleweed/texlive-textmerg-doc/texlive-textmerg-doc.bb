SUMMARY = "Documentation for texlive-textmerg"
DESCRIPTION = "This package includes the documentation for texlive-textmerg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.01svn20677"

RPM_NAME = "texlive-textmerg-doc-2023.201.2.01svn20677-54.1.noarch.rpm"
RPM_HASH = "a2ebf03cd975cc50ad3ecc255fc8ac8fce7bdb72c47a111a32704fa1b717281fbcbdb4ccdbd97a0cbcc72536670a1c0caa9df64e94b153905a5fc5893cd1060c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textmerg-doc"
RDEPENDS:${PN} += ""

inherit rpm
