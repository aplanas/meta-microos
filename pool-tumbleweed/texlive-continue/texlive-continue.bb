SUMMARY = "Prints 'continuation' marks on pages of multipage documents"
DESCRIPTION = "This package provides for a variety of continuation indicators \
on pages when the text continues on the following page. The \
default is to only mark odd pages, but all pages can be marked \
and the marking can be stopped or started at any point."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn49449"

RPM_NAME = "texlive-continue-2023.209.0.0.2svn49449-55.1.noarch.rpm"
RPM_HASH = "d5965745982991ba81a04c65799e20c99ab57e5f6c0ead6ac79d5c51929ac75c1851dd9dc93652a89f2f216f4b737b8d7b5d3faa444a65325c4d00fbf756909f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-continue.sty \
texlive-continue"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-picture.sty \
tex-zref-abspage.sty \
tex-zref-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
