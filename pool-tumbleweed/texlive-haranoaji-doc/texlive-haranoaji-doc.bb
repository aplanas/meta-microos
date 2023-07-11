SUMMARY = "Documentation for texlive-haranoaji"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-doc-2023.201.20230223svn66115-53.2.noarch.rpm"
RPM_HASH = "3c8b20beca5d211bb57dd127d00c3d08956b065d30b53d153b970e6e639842bcef8014a399c82a8603e66a67453adb1f35b2a45f0feb48a76e32e2f0ce9146a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-doc"

RDEPENDS:${PN} += ""

inherit rpm
