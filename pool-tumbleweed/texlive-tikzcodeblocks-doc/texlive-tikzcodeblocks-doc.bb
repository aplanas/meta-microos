SUMMARY = "Documentation for texlive-tikzcodeblocks"
DESCRIPTION = "This package includes the documentation for texlive-tikzcodeblocks"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-doc-2023.209.0.0.13svn54758-53.1.noarch.rpm"
RPM_HASH = "63ae15fdb5492e4177ac0c9205ebe22b69780fca440a8ddb132401f4742e4539439d8c1cf56c161e64b1c7bebe38cdca75ef0c70fcb97a96b0bbd73c921a4900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikzcodeblocks-doc-de \
texlive-tikzcodeblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
