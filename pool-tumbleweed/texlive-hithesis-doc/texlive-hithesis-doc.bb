SUMMARY = "Documentation for texlive-hithesis"
DESCRIPTION = "This package includes the documentation for texlive-hithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-doc-2023.209.2.0.11svn64005-54.2.noarch.rpm"
RPM_HASH = "d018f1d4fabfe3029bcc855e3fafb4efcb27918d0cfa113f1b38be6db646aa951bbf6d0e7b328591ede6b4a2f3d484433cd68b950a154d35ac22b4bbe3a660ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hithesis-doc-zh \
texlive-hithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
