SUMMARY = "Documentation for texlive-gsemthesis"
DESCRIPTION = "This package includes the documentation for texlive-gsemthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-doc-2023.201.0.0.9.4svn56291-53.2.noarch.rpm"
RPM_HASH = "ab0272a23bb8ec3fc28b50df2f5dc9a0fe12bd7752847493576f1e95fa8729f5f32a49754ae832472bb3440903e47ab3cc4ebffc0d0de06a44d817075c211d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsemthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
