SUMMARY = "Running headers of the form 'Notes to pp.xx-yy'"
DESCRIPTION = "Endheads provides running headers of the form 'Notes to pp. \
xx-yy' for endnotes sections. It also enables one to reset the \
endnotes counter, and put a line marking the chapter change in \
the endnotes, at the beginning of every chapter. Endheads \
requires the fancyhdr, needspace, ifthen, and endnotes \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn43750"

RPM_NAME = "texlive-endheads-2023.201.1.6svn43750-53.1.noarch.rpm"
RPM_HASH = "2ac3d8704f53fc479169a83c401449e62b2774480c0b93175683673b6f6f650e39f9cbd251279e30b116445551699851b119dc22a828f3c58af98a9b394339d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(endheads.sty) \
texlive-endheads"

RDEPENDS:${PN} += "/bin/sh \
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
