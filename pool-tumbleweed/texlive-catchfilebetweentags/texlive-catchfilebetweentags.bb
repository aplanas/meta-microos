SUMMARY = "Catch text delimited by docstrip tags"
DESCRIPTION = "This package (built using the facilities of catchfile) provides \
a macro \\catchfilebetweentags acts like the original \\catchfile \
but only extracts a portion of the file instead of the complete \
file. The extracted portion can be delimited by strings or by \
docstrip tags: %<*tag> .... %</tag> (comments in the caught \
region may be included or dropped)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-2023.201.1.1svn21476-52.1.noarch.rpm"
RPM_HASH = "5ef31070747172d8db73d706987a1e32da9568ef4936035e88d24243b00a89b269db5d7043fb71ffd4148c518d30a05aaaeebc6ace07f6d77a93c9fa174ecbcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(catchfilebetweentags.sty) \
texlive-catchfilebetweentags"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(catchfile.sty) \
tex(etex.sty) \
tex(etoolbox.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
