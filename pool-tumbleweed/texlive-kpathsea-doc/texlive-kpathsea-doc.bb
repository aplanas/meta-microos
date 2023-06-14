SUMMARY = "Documentation for texlive-kpathsea"
DESCRIPTION = "This package includes the documentation for texlive-kpathsea"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn66209"

RPM_NAME = "texlive-kpathsea-doc-2023.201.svn66209-55.1.noarch.rpm"
RPM_HASH = "c53be0366b8e2cb78938e86b1c6096e2de611b93618a09c25d308c6c1700fbcbc26714f0e781a4f7ec7ad462327327a447d07670a70bde289463b47bc323a08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-kpseaccess.1 \
man-kpsereadlink.1 \
man-kpsestat.1 \
man-kpsewhich.1 \
texlive-kpathsea-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
