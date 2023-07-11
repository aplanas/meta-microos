SUMMARY = "Documentation for texlive-engpron"
DESCRIPTION = "This package includes the documentation for texlive-engpron"
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn16558"

RPM_NAME = "texlive-engpron-doc-2023.201.2svn16558-53.2.noarch.rpm"
RPM_HASH = "7c44fb4b925e29e58ea43807b00ae5bbce0e629f658f58555aff6fc86ebd45823388c87cf128a1b503f708e126248f9ed355a388be2bceff6d0d37e6035352c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engpron-doc-fr;en \
texlive-engpron-doc"

RDEPENDS:${PN} += ""

inherit rpm
