SUMMARY = "Helps creating an ebook by providing an ebook class"
DESCRIPTION = "The package defines a command \\ebook that defines page layout, \
fonts, and font-sizes for documents to be rendered as \
PDF-ebooks on small ebook-readers. The package has been tested \
with Kindle e-ink and iPad mini."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn29466"

RPM_NAME = "texlive-ebook-2023.209.svn29466-54.2.noarch.rpm"
RPM_HASH = "b2751e6f3163f28414f0f62aa4a3ca068d040481e63df0f9f9d40ce45c577e54baa88b7fe72294eb00ac740e4639c5196afc9488ae61421ec5a4b0da8f1dcbcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebook.sty \
texlive-ebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-hyperref.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
