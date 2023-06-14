SUMMARY = "Key/value support with a hash"
DESCRIPTION = "This package provides only two macros viz. \\TheKey and \
\\TheValue to define then use pairs of key/value and gives a \
semblance of a hash. Syntax: \\TheKey{key}{value} to define the \
value associated to the key, does not produce text; \
\\TheValue{key} to return the value linked to the key. Both \
arguments of \\TheKey are 'moving' as LaTeX defines the term and \
we have sometimes to protect them."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55985"

RPM_NAME = "texlive-clefval-2023.201.0.0.1svn55985-53.1.noarch.rpm"
RPM_HASH = "be2d48b739e1fc9aa4685cdbf7728d07d59149c3e39fea3515ef29fd15afeb0e1a4fe96854e4af316011950355f520d5c61319b8a394bf8bb08d406866145793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clefval.sty \
texlive-clefval"

RDEPENDS:${PN} += "/bin/sh \
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
