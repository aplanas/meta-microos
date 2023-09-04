SUMMARY = "Documentation for texlive-dviasm"
DESCRIPTION = "This package includes the documentation for texlive-dviasm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64430"

RPM_NAME = "texlive-dviasm-doc-2023.209.svn64430-54.2.noarch.rpm"
RPM_HASH = "d23df6d25472efeb64f203ef1c052422e6df0802edc2756c231693de726760502f06e071ac805221629e4e390e796fdf2f83a6769d9307f45e879d047af0297e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviasm.1 \
texlive-dviasm-doc"

RDEPENDS:${PN} += ""

inherit rpm
