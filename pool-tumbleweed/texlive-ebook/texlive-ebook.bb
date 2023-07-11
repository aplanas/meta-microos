SUMMARY = "Helps creating an ebook by providing an ebook class"
DESCRIPTION = "The package defines a command \\ebook that defines page layout, \
fonts, and font-sizes for documents to be rendered as \
PDF-ebooks on small ebook-readers. The package has been tested \
with Kindle e-ink and iPad mini."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn29466"

RPM_NAME = "texlive-ebook-2023.201.svn29466-53.2.noarch.rpm"
RPM_HASH = "0fdfa2d13fd848bc40eb8d25907fd1498ed18cb69d1ca6d4781fa790e00633b9f906ff6ed46fea839fd57a92cf5c454028c97e3b56bf3199e24b8b930f436cf6"
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
