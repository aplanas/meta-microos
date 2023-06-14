SUMMARY = "Bind fonts to specific unicode blocks"
DESCRIPTION = "The package (which runs under XeLaTeX) lets you bind fonts to \
specific unicode blocks, for automatic font tagging of \
multilingual text. The package uses Perl (via perltex) to \
construct its tables."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fontwrap-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "e5f9814ad748b323483aa2e72b95f2eceae207ceb87a0a48f00d58416ccef059532dee419173f254cce7d0adf03eb387957cd1d37603cd7de5a9c078cdd550c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontwrap.sty \
texlive-fontwrap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-perltex.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
