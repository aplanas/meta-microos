SUMMARY = "Documentation for texlive-authorarchive"
DESCRIPTION = "This package includes the documentation for texlive-authorarchive"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.0svn65777"

RPM_NAME = "texlive-authorarchive-doc-2023.201.1.3.0svn65777-53.1.noarch.rpm"
RPM_HASH = "f870db82b08feefb0c6c7c3e5e923f6dd029deaf0c74352c82a1aa8b6768d4735f9617853cabccd4aac7e49a3797c917476a9a14881d396da377b1a5f2a9c6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorarchive-doc"

RDEPENDS:${PN} += ""

inherit rpm
