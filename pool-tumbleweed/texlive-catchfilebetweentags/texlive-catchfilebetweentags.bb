SUMMARY = "Catch text delimited by docstrip tags"
DESCRIPTION = "This package (built using the facilities of catchfile) provides \
a macro \\catchfilebetweentags acts like the original \\catchfile \
but only extracts a portion of the file instead of the complete \
file. The extracted portion can be delimited by strings or by \
docstrip tags: %<*tag> .... %</tag> (comments in the caught \
region may be included or dropped)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-2023.209.1.1svn21476-53.1.noarch.rpm"
RPM_HASH = "a2951c8c9f3e518ad9bbf9f578c9484b8ff2b5df074db611426d39a5aa0b39bc77196080e44c18e552b9e7f3ef2706a87fbec9090f4e77974f793408ff8346c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catchfilebetweentags.sty \
texlive-catchfilebetweentags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
