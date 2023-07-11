SUMMARY = "Running headers of the form 'Notes to pp.xx-yy'"
DESCRIPTION = "Endheads provides running headers of the form 'Notes to pp. \
xx-yy' for endnotes sections. It also enables one to reset the \
endnotes counter, and put a line marking the chapter change in \
the endnotes, at the beginning of every chapter. Endheads \
requires the fancyhdr, needspace, ifthen, and endnotes \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn43750"

RPM_NAME = "texlive-endheads-2023.201.1.6svn43750-53.2.noarch.rpm"
RPM_HASH = "55f64708de71cf906a62f667b74c7843f4db6ffdd8d1f7e717a18c20a8a205ec802ff4306710c5a9c07e6f4540c4d27bcda44782aad96936d1babfe846e6264c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endheads.sty \
texlive-endheads"

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
