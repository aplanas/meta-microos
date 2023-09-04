SUMMARY = "Documentation for texlive-hypdvips"
DESCRIPTION = "This package includes the documentation for texlive-hypdvips"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn53197"

RPM_NAME = "texlive-hypdvips-doc-2023.209.3.03svn53197-54.1.noarch.rpm"
RPM_HASH = "9adaa408dac503c61bc58e142e781452da0cef39fbb8f6b32dd772580581a842cfeefc7cd9c317207e2973bed1085e7ba1c16c9a51094e1e774c91d44267c12e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdvips-doc"

RDEPENDS:${PN} += ""

inherit rpm
