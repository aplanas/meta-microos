SUMMARY = "Documentation for texlive-tikz-nef"
DESCRIPTION = "This package includes the documentation for texlive-tikz-nef"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-doc-2023.209.0.0.1svn55920-53.1.noarch.rpm"
RPM_HASH = "80aa0b20837efcad6edb255d6af0f735bf43bf59dad754677f4534d7d119621a8f04f27ecc7540134793781a14bf4458e8f94e2e963db06aef58f0f97a745df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-nef-doc"

RDEPENDS:${PN} += ""

inherit rpm
