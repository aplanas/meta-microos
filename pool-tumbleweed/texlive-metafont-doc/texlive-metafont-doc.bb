SUMMARY = "Documentation for texlive-metafont"
DESCRIPTION = "This package includes the documentation for texlive-metafont"
LICENSE = "SUSE-TeX"

PV = "2023.209.2.71828182svn66186"

RPM_NAME = "texlive-metafont-doc-2023.209.2.71828182svn66186-55.1.noarch.rpm"
RPM_HASH = "05768c481a88397069eef6014ec2cdab1a78c68f71ee09fbf4225873df6a8476a5ef633c286a05072312d772b39fc519447ca5174456b1c93491c52e7f2bdbf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-inimf.1 \
man-mf-nowin.1 \
man-mf.1 \
texlive-metafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
