SUMMARY = "Helps creating an ebook by providing an ebook class"
DESCRIPTION = "The package defines a command \\ebook that defines page layout, \
fonts, and font-sizes for documents to be rendered as \
PDF-ebooks on small ebook-readers. The package has been tested \
with Kindle e-ink and iPad mini."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn29466"

RPM_NAME = "texlive-ebook-2023.209.svn29466-54.1.noarch.rpm"
RPM_HASH = "2a953216cb6d27d237d5925a3038df89b834cec8ecf8dbfa96608663673e4dd0ef5d900e4a84d9d0ab05b597f85abb5a2368d12cda83fa1ad79a2d5dcdf5521c"
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
