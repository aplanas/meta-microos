SUMMARY = "Documentation for texlive-aesupp"
DESCRIPTION = "This package includes the documentation for texlive-aesupp"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1svn58253"

RPM_NAME = "texlive-aesupp-doc-2023.201.1svn58253-54.1.noarch.rpm"
RPM_HASH = "ab3f8df8262920ad99fcfd9683ebbb6e953fff4e780d0cb2eeed4de9e62c0d02f3a26cd3acf54d4ccc5905845b12bd89c2859f073c3116478f3d9f4674c9b655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aesupp-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge \
/usr/bin/perl"

inherit rpm
