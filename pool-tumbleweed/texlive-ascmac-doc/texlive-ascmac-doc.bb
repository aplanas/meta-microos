SUMMARY = "Documentation for texlive-ascmac"
DESCRIPTION = "This package includes the documentation for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.1svn53411"

RPM_NAME = "texlive-ascmac-doc-2023.201.2.1svn53411-53.1.noarch.rpm"
RPM_HASH = "ff3e933ebfec89b5064dfa6f59a6a27f2e99adbd82bfaeddd61f428deeb7744d22a82f9196c5da0a23e5a5b9426a109a42f23a2cb86ba6451c8eae9a965c75a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ascmac-doc:ja) \
texlive-ascmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
