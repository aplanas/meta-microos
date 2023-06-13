SUMMARY = "Documentation for texlive-tkz-tab"
DESCRIPTION = "This package includes the documentation for texlive-tkz-tab"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-doc-2023.201.2.12csvn66115-52.1.noarch.rpm"
RPM_HASH = "9751d96e08ab6a81458e634e868417098c97b28fdb76b4a7d9d18817e6bd3db45b2f2fe3b0095186077a7d1ebd55cd1e8bbc48a525dd6423a4ce694742a54da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tkz-tab-doc:fr) \
texlive-tkz-tab-doc"

RDEPENDS:${PN} += ""

inherit rpm
