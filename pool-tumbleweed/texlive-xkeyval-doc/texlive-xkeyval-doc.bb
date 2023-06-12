SUMMARY = "Documentation for texlive-xkeyval"
DESCRIPTION = "This package includes the documentation for texlive-xkeyval"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn63616"

RPM_NAME = "texlive-xkeyval-doc-2023.201.2.9svn63616-52.1.noarch.rpm"
RPM_HASH = "5296272772a76f29ffcd865e991c58d0eeab6841ab7a29fb639444707e6ec15c86c041434b13fc2a2ee761a0e34e23fc29141b07c4b9aa92d68f0172e454a890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeyval-doc"
RDEPENDS:${PN} += ""

inherit rpm
