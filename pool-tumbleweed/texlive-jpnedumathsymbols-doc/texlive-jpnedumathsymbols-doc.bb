SUMMARY = "Documentation for texlive-jpnedumathsymbols"
DESCRIPTION = "This package includes the documentation for texlive-jpnedumathsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63864"

RPM_NAME = "texlive-jpnedumathsymbols-doc-2023.209.1.1svn63864-56.1.noarch.rpm"
RPM_HASH = "8dde3b91f6c62d5f2341952ec2644399209feb38bf6456e69ba52d9b601567136366ea09c03563db30867dd7c0e68b99bdefe66381c8107041b54b0e88ded2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpnedumathsymbols-doc-en \
texlive-jpnedumathsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
