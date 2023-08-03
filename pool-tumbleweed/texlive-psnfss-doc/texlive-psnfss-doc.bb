SUMMARY = "Documentation for texlive-psnfss"
DESCRIPTION = "This package includes the documentation for texlive-psnfss"
LICENSE = "LPPL-1.0"

PV = "2023.209.9.3svn54694"

RPM_NAME = "texlive-psnfss-doc-2023.209.9.3svn54694-53.1.noarch.rpm"
RPM_HASH = "546166466edc25e6f0be6be5a372d08c9409ba5f5b9cc4ffba47f76db79af8bb7449d2fdbedf38fc5321369a737498d4aa95bd10b85376c43c79080e2d754dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
