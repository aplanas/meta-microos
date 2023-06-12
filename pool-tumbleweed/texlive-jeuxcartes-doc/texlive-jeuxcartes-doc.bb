SUMMARY = "Documentation for texlive-jeuxcartes"
DESCRIPTION = "This package includes the documentation for texlive-jeuxcartes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.3svn66190"

RPM_NAME = "texlive-jeuxcartes-doc-2023.201.0.0.2.3svn66190-55.1.noarch.rpm"
RPM_HASH = "e69703502dd2887315d2904cc460b68f9acdb95a215137b3cea5968e9a30889d6bd27c0c5e23aa335593c7ad16957d7e35b8f00e60898165ac43f81942313172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-jeuxcartes-doc:fr) \
texlive-jeuxcartes-doc"
RDEPENDS:${PN} += ""

inherit rpm
