SUMMARY = "Documentation for texlive-umoline"
DESCRIPTION = "This package includes the documentation for texlive-umoline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19085"

RPM_NAME = "texlive-umoline-doc-2023.201.svn19085-53.1.noarch.rpm"
RPM_HASH = "2a436a737173a618e022a84d215496f7c0bcc553a8b944298f9a71b21479eba2693aaf12fbb52289d889f95221571fd0dbdca43ffe00eb35c9b5433ee7405ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umoline-doc"

RDEPENDS:${PN} += ""

inherit rpm
