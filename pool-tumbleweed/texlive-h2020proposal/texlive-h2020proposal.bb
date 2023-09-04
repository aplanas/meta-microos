SUMMARY = "LaTeX class and template for EU H2020 RIA proposal"
DESCRIPTION = "This package consists of a class file as well as FET and ICT \
proposal templates for writing EU H2020 RIA proposals and \
generating automatically the many cross-referenced tables that \
are required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-2023.209.1.0svn38428-54.2.noarch.rpm"
RPM_HASH = "538806b25e855a31035eb25417b80760bbaab5121d171394900046c5681593314c76c3387f2444fc9aeb5857478f1a3eca11c7f8fefed6a369764dcf35e17904"
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
