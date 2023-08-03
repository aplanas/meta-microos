SUMMARY = "Documentation for texlive-kpathsea"
DESCRIPTION = "This package includes the documentation for texlive-kpathsea"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn66209"

RPM_NAME = "texlive-kpathsea-doc-2023.209.svn66209-56.1.noarch.rpm"
RPM_HASH = "8d19bd273b035646fe8b274bb1b84eb1fd8622ea91b60cb1fffc0e0464acb2d02076893cd67537025e12d6fdca44c73f0080b73905dd65555a1a4785a4b512dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-kpseaccess.1 \
man-kpsereadlink.1 \
man-kpsestat.1 \
man-kpsewhich.1 \
texlive-kpathsea-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
