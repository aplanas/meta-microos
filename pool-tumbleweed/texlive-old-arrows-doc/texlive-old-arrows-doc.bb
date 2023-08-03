SUMMARY = "Documentation for texlive-old-arrows"
DESCRIPTION = "This package includes the documentation for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn42872"

RPM_NAME = "texlive-old-arrows-doc-2023.209.2.0svn42872-55.1.noarch.rpm"
RPM_HASH = "bccd24bfc96f3104e3ef403d1e19b0d5c1fd1c0075c40ab704329c8422c5662ffb0fe26a3092b0a643533b2496ac60df1999f0cd87d626b21f58587e5efa8402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-old-arrows-doc-it \
texlive-old-arrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
