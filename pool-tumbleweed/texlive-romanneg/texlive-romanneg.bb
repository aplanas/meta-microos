SUMMARY = "Roman page numbers negative"
DESCRIPTION = "Causes the page numbers in the DVI file (as defined by \\count0) \
to be negative when roman pagenumbering is in effect."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20087"

RPM_NAME = "texlive-romanneg-2023.209.svn20087-54.1.noarch.rpm"
RPM_HASH = "f23861be78ca442d326d75acdf80b6c59072567691952ea01bd01ab03baf85420d9f0646170ed27ff3943448b8ded805eb4c32f846c9a43df608113d2f30fcbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanneg.sty \
texlive-romanneg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
