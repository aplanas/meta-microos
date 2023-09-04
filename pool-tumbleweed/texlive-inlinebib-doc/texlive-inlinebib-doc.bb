SUMMARY = "Documentation for texlive-inlinebib"
DESCRIPTION = "This package includes the documentation for texlive-inlinebib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22018"

RPM_NAME = "texlive-inlinebib-doc-2023.209.svn22018-54.1.noarch.rpm"
RPM_HASH = "2693ac3b766d0ba2418a602a7cf3e38c2a73da29452f5f8362ed533d24a702ad772337938cd94583f05ec9f340205f3b4809b489dea089b7b0d4313b49845318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
