SUMMARY = "Provide file name and path of input files"
DESCRIPTION = "The package provides macros holding file name information \
(directory, base name, extension, full name and full path) for \
files read by LaTeX \\input and \\include macros; it uses the \
file hooks provided by the author's filehook. In particular, it \
restores the parent file name after the trailing \\clearpage of \
an \\included file; as a result, the macros may be usefully \
employed in the page header and footer of the last printed page \
of such a file. The depth of inclusion is made available, \
together with the 'parent' (including file) and 'parents' (all \
including files to the root of the tree). The package \
supersedes FiNK."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn64673"

RPM_NAME = "texlive-currfile-2023.209.0.0.8svn64673-55.1.noarch.rpm"
RPM_HASH = "5e13cf73acc212a45f78dd8ad35109cc61e7141127192ed0b3112b62d444548061a590648943095d8234339274e003b8028eae1dc3da27b74876dee967b17b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currfile-abspath.sty \
tex-currfile.sty \
texlive-currfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-filehook.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
