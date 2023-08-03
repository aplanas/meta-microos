SUMMARY = "Documentation for texlive-mfware"
DESCRIPTION = "This package includes the documentation for texlive-mfware"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-mfware-doc-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "a1480a77f9f91cd343d2237e0a6b00998d313978c8090641a0bad6b1ae4b71c0c29956d53157abd980b529f93dfd9110201eaa662520db79a9d05cc5b6cda6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gftodvi.1 \
man-gftopk.1 \
man-gftype.1 \
man-mft.1 \
man-pktogf.1 \
man-pktype.1 \
texlive-mfware-doc"

RDEPENDS:${PN} += ""

inherit rpm
