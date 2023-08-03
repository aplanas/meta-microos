SUMMARY = "Documentation for texlive-leipzig"
DESCRIPTION = "This package includes the documentation for texlive-leipzig"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn52450"

RPM_NAME = "texlive-leipzig-doc-2023.209.2.3svn52450-55.1.noarch.rpm"
RPM_HASH = "6ba2927b96c646fce8927b2d4b2d1a6d07c280511d604ac0a282d88c462ca1387bce89565a5d55999cedf0d6b1179a405925fab9c9d40cdf1c7350d612677f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leipzig-doc"

RDEPENDS:${PN} += ""

inherit rpm
