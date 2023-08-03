SUMMARY = "Quote and refer to a manuscript for minor revisions"
DESCRIPTION = "The package supports those who publish articles in \
peer-reviewed journals. In the final stages of the review \
process, the authors typically have to provide an additional \
document (such as a letter to the editors), in which they \
provide a list of modifications that they made to the \
manuscript. The package automatically provides line numbers and \
quotations from the manuscript, for this letter. The package \
loads the package lineno, so (in effect) shares lineno's \
incompatibilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32165"

RPM_NAME = "texlive-minorrevision-2023.209.1.1svn32165-55.1.noarch.rpm"
RPM_HASH = "f5bcf62aae23be5b7126eff24f64ab0accab542e98129bf44017d09f6c013ba8fbaec60224df36fc6a6ce3c8c29c503ac7b116c62b1e46ba0189c2f65555ce20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minorrevision.sty \
texlive-minorrevision"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lineno.sty \
tex-xkeyval.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
