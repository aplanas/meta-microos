SUMMARY = "Documentation for texlive-grayhints"
DESCRIPTION = "This package includes the documentation for texlive-grayhints"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49052"

RPM_NAME = "texlive-grayhints-doc-2023.209.svn49052-54.2.noarch.rpm"
RPM_HASH = "8994466046762df56c1f5b66ed5e97b79135e968e42993fcd4406a09f30fb2e5ee7c9a01cca0119f322e61881fe0fd80e02ab9651b2dcba881a113f1a02b7bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grayhints-doc"

RDEPENDS:${PN} += ""

inherit rpm
