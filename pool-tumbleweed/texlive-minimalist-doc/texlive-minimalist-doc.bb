SUMMARY = "Documentation for texlive-minimalist"
DESCRIPTION = "This package includes the documentation for texlive-minimalist"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66434"

RPM_NAME = "texlive-minimalist-doc-2023.209.svn66434-55.1.noarch.rpm"
RPM_HASH = "b0591000f7834bf4691c23fb31c6687b235934604d784209b35f1fd25b36a55879083b0e45149867374e88ed4fe11aa18b25c932638cd11b5dc0d06963a0168d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minimalist-doc"

RDEPENDS:${PN} += ""

inherit rpm
