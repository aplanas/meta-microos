SUMMARY = "Documentation for texlive-aesupp"
DESCRIPTION = "This package includes the documentation for texlive-aesupp"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1svn58253"

RPM_NAME = "texlive-aesupp-doc-2023.209.1svn58253-55.1.noarch.rpm"
RPM_HASH = "6e0e5de965d6ac8fea6ffbe70771f78f708712b1b58bb0879b5f186882f4c8cb525c675c4908e88048155e518b3f54ad1d3727a559779882d6538dd8c071fa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aesupp-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge \
/usr/bin/perl"

inherit rpm
