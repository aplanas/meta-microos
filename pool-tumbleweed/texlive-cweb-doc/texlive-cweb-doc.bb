SUMMARY = "Documentation for texlive-cweb"
DESCRIPTION = "This package includes the documentation for texlive-cweb"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-cweb-doc-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "c4181bc159af10bf84bb06fcdfd926f51067c4a1a0f994b7fa28d757a55260b69297a3154f9255ba8fcb8803f0518953930de7eafdacc0a8291d5346df0f3bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctangle.1 \
man-ctwill-refsort.1 \
man-ctwill-twinx.1 \
man-ctwill.1 \
man-cweave.1 \
man-cweb.1 \
man-twill.1 \
texlive-cweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
