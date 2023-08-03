SUMMARY = "Documentation for texlive-adfathesis"
DESCRIPTION = "This package includes the documentation for texlive-adfathesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.42svn26048"

RPM_NAME = "texlive-adfathesis-doc-2023.209.2.42svn26048-55.1.noarch.rpm"
RPM_HASH = "32b7860af89b65d306717b63c255e2dc6e1ddc1d5ac8d0ea46e5ba321ccc64a4ef5660727a2e65a6aa34c2e57050a409dd0997a3bc5d0faf7c17f326c6248d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
