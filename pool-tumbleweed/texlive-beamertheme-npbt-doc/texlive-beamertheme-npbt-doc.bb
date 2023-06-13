SUMMARY = "Documentation for texlive-beamertheme-npbt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-npbt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-doc-2023.201.4.1svn54512-53.1.noarch.rpm"
RPM_HASH = "c0606c1aaefdef9cf649681fff5301bdfe7fc9467ba37e1f37f37fa03eb77102188e69b52c9f542648bd5daa8c5681a8591e596840621e40138ec9ab669603ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-npbt-doc"

RDEPENDS:${PN} += ""

inherit rpm
