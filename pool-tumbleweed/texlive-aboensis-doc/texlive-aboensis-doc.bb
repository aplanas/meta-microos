SUMMARY = "Documentation for texlive-aboensis"
DESCRIPTION = "This package includes the documentation for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2023.209.svn62977"

RPM_NAME = "texlive-aboensis-doc-2023.209.svn62977-55.1.noarch.rpm"
RPM_HASH = "681fd52ea9781772d2a9f948fb1d0321195a6e2c512ee15dd3ef63cb5fffcf1adec31490ccb2b437a8202c9d0e153c4ad3847b9ac20df5ba7e1eed9311abc0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aboensis-doc"

RDEPENDS:${PN} += ""

inherit rpm
