SUMMARY = "Documentation for texlive-euler"
DESCRIPTION = "This package includes the documentation for texlive-euler"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn42428"

RPM_NAME = "texlive-euler-doc-2023.201.2.5svn42428-52.1.noarch.rpm"
RPM_HASH = "b4fbb726e711f6ef3c27112286e68e436bce62a333a041acbfea381fcce1b7bf4d749004c97fe67e6da27d21eb8f3be6270ae5228d61f5e4c5bb688570d58af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-doc"

RDEPENDS:${PN} += ""

inherit rpm
