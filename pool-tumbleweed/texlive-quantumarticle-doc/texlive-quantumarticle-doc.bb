SUMMARY = "Documentation for texlive-quantumarticle"
DESCRIPTION = "This package includes the documentation for texlive-quantumarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-doc-2023.201.6.1svn65242-53.2.noarch.rpm"
RPM_HASH = "238cb8ac82c7a7aaa71d9663033e6a130933bbcdd15221e3159e4a9afe20727c27c7fa1e0f13ed3947efa22f27892ff1add0d77dfd47ec9f5b543957ba05609f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
