SUMMARY = "LaTeX class and template for EU H2020 RIA proposal"
DESCRIPTION = "This package consists of a class file as well as FET and ICT \
proposal templates for writing EU H2020 RIA proposals and \
generating automatically the many cross-referenced tables that \
are required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-2023.209.1.0svn38428-54.1.noarch.rpm"
RPM_HASH = "654ac4fdc1757f2136f96c3059537e1657e1b300d72f0ed034513025d54aa4dc613acfac0067475e3549e7d0acac2d2e5b878a9733b9af93198051c99e3761c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-h2020proposal.cls \
texlive-h2020proposal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-colortbl.sty \
tex-coolstr.sty \
tex-longtable.sty \
tex-memoir.cls \
tex-morewrites.sty \
tex-rotating.sty \
tex-showkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
