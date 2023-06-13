SUMMARY = "Documentation for texlive-nameauth"
DESCRIPTION = "This package includes the documentation for texlive-nameauth"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.7svn65738"

RPM_NAME = "texlive-nameauth-doc-2023.201.3.7svn65738-54.1.noarch.rpm"
RPM_HASH = "e6b18ac101e10430675fe2cb9899de8d169c9048440aea1d16863f406186800a787796fbe2ecdacf0aa213202cd3942ac3ba559f203544d6ba287fe57033ecce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nameauth-doc"

RDEPENDS:${PN} += ""

inherit rpm
