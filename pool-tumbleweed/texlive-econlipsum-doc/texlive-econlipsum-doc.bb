SUMMARY = "Documentation for texlive-econlipsum"
DESCRIPTION = "This package includes the documentation for texlive-econlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-doc-2023.201.0.0.8.2svn58390-53.2.noarch.rpm"
RPM_HASH = "d1ab78441bb1e4347b538eb6296b57d7f195363a50787a5f022c5bcb63da05dfa5f4119ebc55ff373cf57cdff6db7a86d76796f3895c7c5dd4cca9212e9a468b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
