SUMMARY = "Documentation for texlive-picture"
DESCRIPTION = "This package includes the documentation for texlive-picture"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54867"

RPM_NAME = "texlive-picture-doc-2023.209.1.6svn54867-52.1.noarch.rpm"
RPM_HASH = "bff977b5803263f7255812445d8345ed53d1779c460f4a215912bc912e684f24848739a52cc64153ae47fc31fbc9e6c57afcb5cd910c754c96824588254093a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-picture-doc"

RDEPENDS:${PN} += ""

inherit rpm
