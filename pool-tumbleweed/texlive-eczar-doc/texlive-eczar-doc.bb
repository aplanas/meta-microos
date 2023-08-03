SUMMARY = "Documentation for texlive-eczar"
DESCRIPTION = "This package includes the documentation for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.1svn57716"

RPM_NAME = "texlive-eczar-doc-2023.209.0.0.1svn57716-54.1.noarch.rpm"
RPM_HASH = "90cad7650e5c5d4df6a778671e0b7818b0993d0e6bb7ac4e8ffcf4c0ebb2aba8620da6107d061bf83d5fbf3368c6cdce635cba775c332ffc1041489e788cb027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar-doc"

RDEPENDS:${PN} += ""

inherit rpm
