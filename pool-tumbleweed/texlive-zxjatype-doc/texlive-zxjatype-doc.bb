SUMMARY = "Documentation for texlive-zxjatype"
DESCRIPTION = "This package includes the documentation for texlive-zxjatype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-doc-2023.209.0.0.7svn53500-53.1.noarch.rpm"
RPM_HASH = "73dba01358fd8971af05caf2451edf2ac980654a1467aadc25dcdd0f6556aba8bcb80ee7a7f87c859e2c4d17e0e51c074daceaf92389a25a05ff3aa881b84042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjatype-doc-ja \
texlive-zxjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
