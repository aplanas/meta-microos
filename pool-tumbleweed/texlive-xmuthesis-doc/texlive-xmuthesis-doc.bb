SUMMARY = "Documentation for texlive-xmuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xmuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-doc-2023.201.0.0.4.1svn56614-52.2.noarch.rpm"
RPM_HASH = "5eea8344d1bfeaf2578386bbacd40402f5c11d995fe99e5e75d6911f30e0247422e498bb2257f07ef6d562b3d9803f9c1809d60e06ff0208c4db2b3c58504709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
