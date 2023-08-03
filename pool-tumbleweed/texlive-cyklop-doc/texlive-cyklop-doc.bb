SUMMARY = "Documentation for texlive-cyklop"
DESCRIPTION = "This package includes the documentation for texlive-cyklop"
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.915svn18651"

RPM_NAME = "texlive-cyklop-doc-2023.209.0.0.915svn18651-55.1.noarch.rpm"
RPM_HASH = "d8450e2a218e20fe8a7930b475775f393b52c0caff7acd70adf6ba27cc7f0057907e972920bd97b6fffe605af3b49322972b1deea1ea73eb07f3d4b600105369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyklop-doc"

RDEPENDS:${PN} += ""

inherit rpm
