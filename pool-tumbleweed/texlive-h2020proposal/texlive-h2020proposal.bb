SUMMARY = "LaTeX class and template for EU H2020 RIA proposal"
DESCRIPTION = "This package consists of a class file as well as FET and ICT \
proposal templates for writing EU H2020 RIA proposals and \
generating automatically the many cross-referenced tables that \
are required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-2023.201.1.0svn38428-53.2.noarch.rpm"
RPM_HASH = "1d6725943ac75143e3ee2a05fa1557191de36401d55e05dae990374158b72c935a58154534606ca1421835c30cb0becc8179ac8bc29f284571643410e967d415"
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
