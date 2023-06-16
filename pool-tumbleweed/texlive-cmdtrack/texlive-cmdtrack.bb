SUMMARY = "Check used commands"
DESCRIPTION = "The package keeps track of whether a command defined in a \
document preamble is actually used somewhere in the document. \
After the package is loaded in the preamble of a document, all \
\\newcommand (and similar command definitions) between that \
point and the beginning of the document will be marked for \
logging. At the end of the document a report of command usage \
will be printed in the TeX log, for example: 'mdash was used on \
line 25'; 'ndash was never used'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28910"

RPM_NAME = "texlive-cmdtrack-2023.201.svn28910-53.1.noarch.rpm"
RPM_HASH = "cae49d29179e40685d8d46d782ab1885c2e6fde1fee3c302dafa77dc3529f203c4f95f942dcdef543066a962a9779554f623c9d3d8e3901626e3781294a19dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdtrack.sty \
texlive-cmdtrack"

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
