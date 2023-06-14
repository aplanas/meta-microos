SUMMARY = "Documentation for texlive-ttfutils"
DESCRIPTION = "This package includes the documentation for texlive-ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-ttfutils-doc-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "5c8dfa2775b98f3ab6eed6e13be8e8dc9aab2bba024c88fa3aa1820d17879735a4a667395a0ebafdc039b6e498c27929a58336cf2925494544f088695aa09f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ttf2afm.1 \
man-ttf2pk.1 \
man-ttf2tfm.1 \
man-ttfdump.1 \
texlive-ttfutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
