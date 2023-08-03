SUMMARY = "Documentation for texlive-schedule"
DESCRIPTION = "This package includes the documentation for texlive-schedule"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn51805"

RPM_NAME = "texlive-schedule-doc-2023.209.1.20svn51805-54.1.noarch.rpm"
RPM_HASH = "b967ca327cdb58e9ee1d83352d25a19e6561142e89d0585ea37ee1d2bb43eb54b1ce6b2c7328c75d92d246627559f96b17585ed909c0f8c99cd3cdb29986556a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schedule-doc"

RDEPENDS:${PN} += ""

inherit rpm
