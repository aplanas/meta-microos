SUMMARY = "Running headers of the form 'Notes to pp.xx-yy'"
DESCRIPTION = "Endheads provides running headers of the form 'Notes to pp. \
xx-yy' for endnotes sections. It also enables one to reset the \
endnotes counter, and put a line marking the chapter change in \
the endnotes, at the beginning of every chapter. Endheads \
requires the fancyhdr, needspace, ifthen, and endnotes \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn43750"

RPM_NAME = "texlive-endheads-2023.209.1.6svn43750-54.2.noarch.rpm"
RPM_HASH = "529b7b6e54d95af4b49b8de14225059757b3f968779c039a051ade09a643005e92382539f7ee13f19ad1e265baff5f986857e6341c41ff156512095e4aa66941"
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
