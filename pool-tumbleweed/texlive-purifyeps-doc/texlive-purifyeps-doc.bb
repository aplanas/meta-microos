SUMMARY = "Documentation for texlive-purifyeps"
DESCRIPTION = "This package includes the documentation for texlive-purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn29725"

RPM_NAME = "texlive-purifyeps-doc-2023.201.1.1svn29725-53.1.noarch.rpm"
RPM_HASH = "3695b4976da200772d4f84213836fea283a74129a9fa96f4b3e00503e77c8e324f9c51db5a6f7f5428932651e00c8d75f2f62fedc9f3af6eea60e9e2d39f45dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(purifyeps.1) \
texlive-purifyeps-doc"

RDEPENDS:${PN} += ""

inherit rpm
