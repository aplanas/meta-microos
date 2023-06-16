SUMMARY = "Helps creating an ebook by providing an ebook class"
DESCRIPTION = "The package defines a command \\ebook that defines page layout, \
fonts, and font-sizes for documents to be rendered as \
PDF-ebooks on small ebook-readers. The package has been tested \
with Kindle e-ink and iPad mini."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn29466"

RPM_NAME = "texlive-ebook-2023.201.svn29466-53.1.noarch.rpm"
RPM_HASH = "f322d4ed309ac0d3880222d946f2eba7f0302df37463ff0c4744bcbb3e43cb8a0a20c85b53000667429b88e85dce443d8f03f70e434510c54061a4b47386b46b"
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
