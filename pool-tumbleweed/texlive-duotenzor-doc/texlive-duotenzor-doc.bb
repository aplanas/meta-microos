SUMMARY = "Documentation for texlive-duotenzor"
DESCRIPTION = "This package includes the documentation for texlive-duotenzor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn18728"

RPM_NAME = "texlive-duotenzor-doc-2023.201.1.00svn18728-52.1.noarch.rpm"
RPM_HASH = "cd417eab25c90422e09d609c75064510ee7ac281a968a50874579243d53c86b1ca5e6f67f614dfc71dea0063fb79008ca508b13ef92a15a8654c73e69f7bccc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duotenzor-doc"

RDEPENDS:${PN} += ""

inherit rpm
