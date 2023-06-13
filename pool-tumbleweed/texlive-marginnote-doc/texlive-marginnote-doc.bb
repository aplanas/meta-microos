SUMMARY = "Documentation for texlive-marginnote"
DESCRIPTION = "This package includes the documentation for texlive-marginnote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4bsvn48383"

RPM_NAME = "texlive-marginnote-doc-2023.201.1.4bsvn48383-52.1.noarch.rpm"
RPM_HASH = "ac5bba4fc5c36fd7501c5d0181931fccbe72b91567344111fee792dcd8efb877bb3ec486a88bc2bf1125f2ff9d115af7f2f7b2256eb080540a44e9691a0ba4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
