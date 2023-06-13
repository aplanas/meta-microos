SUMMARY = "Documentation for texlive-context-gnuplot"
DESCRIPTION = "This package includes the documentation for texlive-context-gnuplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-gnuplot-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "e06a23a2794311042ffb74bfbba93e6f718c82c94a2d26cbc28fb8171c69c642ae5999518279f66143e7026e5a9fca75c7caec3e1f5ca3949682ba78d2810762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
