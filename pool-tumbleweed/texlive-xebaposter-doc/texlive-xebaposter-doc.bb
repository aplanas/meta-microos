SUMMARY = "Documentation for texlive-xebaposter"
DESCRIPTION = "This package includes the documentation for texlive-xebaposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.53svn63513"

RPM_NAME = "texlive-xebaposter-doc-2023.209.2.53svn63513-53.2.noarch.rpm"
RPM_HASH = "62a1fe80d757932f1f23b2e916b721cfdb6cd30b849854bb6d92644aeb04b14b5abc57e9cc86b8757547cafad85aca98d70f319760559426eee8c8f3fcb76af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xebaposter-doc-fa \
texlive-xebaposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
