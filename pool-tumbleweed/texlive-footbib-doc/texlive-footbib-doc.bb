SUMMARY = "Documentation for texlive-footbib"
DESCRIPTION = "This package includes the documentation for texlive-footbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn17115"

RPM_NAME = "texlive-footbib-doc-2023.201.2.0.7svn17115-52.1.noarch.rpm"
RPM_HASH = "480c023c0d5d82c6972239ab7032794a0ccb6e209f619471eb49d6734ac9159f0000ba7b216e89b82721225f68a47ade0bc42a010222a1ad7c0968a8ecb2c339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footbib-doc"
RDEPENDS:${PN} += ""

inherit rpm
