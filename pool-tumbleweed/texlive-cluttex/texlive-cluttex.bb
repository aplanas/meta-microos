SUMMARY = "An automation tool for running LaTeX"
DESCRIPTION = "This is another tool for the automation of LaTeX document \
processing, like latexmk or arara. The main feature of this \
tool is that it does not clutter your working directory with \
.aux or .log or other auxiliary files. It has of course the \
usual features of automation tools: It automatically re-runs \
(La)TeX for cross-references. MakeIndex, BibTeX, Biber, or \
makeglossaries will be executed if a corresponding option is \
set. Furthermore, cluttex can watch input files for changes \
(using an external program)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn60964"

RPM_NAME = "texlive-cluttex-2023.209.0.0.5.1svn60964-54.1.noarch.rpm"
RPM_HASH = "3db293a176f9ea9bc23753117632c17a05a3239fbee530f62c1bb2e576aa4acc400976f91916f8ed9f26b11e3682b93bb9d602111290f8f130988f32eec27a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cluttex"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cluttex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
