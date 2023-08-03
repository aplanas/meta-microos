SUMMARY = "Key/value support with a hash"
DESCRIPTION = "This package provides only two macros viz. \\TheKey and \
\\TheValue to define then use pairs of key/value and gives a \
semblance of a hash. Syntax: \\TheKey{key}{value} to define the \
value associated to the key, does not produce text; \
\\TheValue{key} to return the value linked to the key. Both \
arguments of \\TheKey are 'moving' as LaTeX defines the term and \
we have sometimes to protect them."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55985"

RPM_NAME = "texlive-clefval-2023.209.0.0.1svn55985-54.1.noarch.rpm"
RPM_HASH = "3e92f1c8d2edf912ab482acc787c3d26c0966581d5b921eed3feec5e249b2345c75e6b25ea7f5eff12c3462c38a69924450ed82095786f3ceec70e064aa832b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clefval.sty \
texlive-clefval"

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
