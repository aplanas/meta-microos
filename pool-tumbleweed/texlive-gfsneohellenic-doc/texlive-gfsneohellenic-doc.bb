SUMMARY = "Documentation for texlive-gfsneohellenic"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn63944"

RPM_NAME = "texlive-gfsneohellenic-doc-2023.201.1.02svn63944-52.1.noarch.rpm"
RPM_HASH = "c0303d0f13c41d53e1b29e83201379a2c662ba20e306373562b0ecc6c32c6bffafff2fe4de8a71b6713921d2ced123e150c153c66c6e60044b3a4966588aaec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenic-doc"
RDEPENDS:${PN} += ""

inherit rpm
