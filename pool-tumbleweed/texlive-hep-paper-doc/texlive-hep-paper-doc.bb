SUMMARY = "Documentation for texlive-hep-paper"
DESCRIPTION = "This package includes the documentation for texlive-hep-paper"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64917"

RPM_NAME = "texlive-hep-paper-doc-2023.201.2.1svn64917-53.1.noarch.rpm"
RPM_HASH = "408f7f8bb22209bf67feb1f15eed6d0dd72ee7c2fb1e1e8c989d9e9b2d91e40c95dbff3897cd57214afbbc39ba36cdea0b8067ff798e38515c150e717284a926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
