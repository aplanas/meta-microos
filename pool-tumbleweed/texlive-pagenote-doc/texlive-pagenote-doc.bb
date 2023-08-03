SUMMARY = "Documentation for texlive-pagenote"
DESCRIPTION = "This package includes the documentation for texlive-pagenote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn63708"

RPM_NAME = "texlive-pagenote-doc-2023.209.1.1asvn63708-52.1.noarch.rpm"
RPM_HASH = "c50c5c1322b2f5dc1e44767a2b6f112c0a208f05275dfa3b338cf34517b6120ea8237073057bd78194f2fb70f7cf5652ba2e3f46967db4d26c9de30665a36876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagenote-doc"

RDEPENDS:${PN} += ""

inherit rpm
