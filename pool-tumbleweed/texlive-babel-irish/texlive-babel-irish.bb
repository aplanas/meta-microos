SUMMARY = "Babel support for Irish"
DESCRIPTION = "The package provides the language definition file for support \
of Irish Gaelic in babel. The principal content is translations \
to Irish of standard 'LaTeX names'. (No shortcuts are defined.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn30277"

RPM_NAME = "texlive-babel-irish-2023.201.1.0hsvn30277-53.1.noarch.rpm"
RPM_HASH = "271e633d5cb52ae3c8cff407fc395a467f815a0044335cfe73ca8e05eb26b4244df99742450e8b2a3e4114b876c72702161dd2183979631df6f861c6b249e646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(irish.ldf) \
texlive-babel-irish"

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
