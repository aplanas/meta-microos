SUMMARY = "Documentation for texlive-ltxnew"
DESCRIPTION = "This package includes the documentation for texlive-ltxnew"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3svn21586"

RPM_NAME = "texlive-ltxnew-doc-2023.208.1.3svn21586-53.1.noarch.rpm"
RPM_HASH = "0b9a782dc1d98921bc78731c23f66bfb15fd99a4d006c0b132207a10dafe5d403a2fbdb82fe22144a70b8de47f3139cd44231a23cfda3f5a866e5b8ac1600a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxnew-doc"

RDEPENDS:${PN} += ""

inherit rpm
