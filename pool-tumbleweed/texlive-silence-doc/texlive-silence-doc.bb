SUMMARY = "Documentation for texlive-silence"
DESCRIPTION = "This package includes the documentation for texlive-silence"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5bsvn27028"

RPM_NAME = "texlive-silence-doc-2023.209.1.5bsvn27028-54.1.noarch.rpm"
RPM_HASH = "f9d54f010abd93c1392f7f0202c2a68f1d0404227199b19d4a5dd17a29a941f70397820f638c727555302432fbedb95c586c70f8a76e21aad3684acb2a7f6601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-silence-doc"

RDEPENDS:${PN} += ""

inherit rpm
