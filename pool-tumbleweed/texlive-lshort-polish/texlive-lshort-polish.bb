SUMMARY = "Introduction to LaTeX in Polish"
DESCRIPTION = "This is the Polish translation of A Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.4pl1svn63289"

RPM_NAME = "texlive-lshort-polish-2023.209.6.4pl1svn63289-55.1.noarch.rpm"
RPM_HASH = "5bb4874cf69630d5477db95f9d90fbb33c51ffb99b2beccaf669bb04568b1057ecc8e6ee74021313ff200a998850fafbcaf71ab75f46b41a17e5caa516d64d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-polish"

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
