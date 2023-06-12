SUMMARY = "Using a color stack for transparency with pdfTeX"
DESCRIPTION = "pdfTeX and LuaTeX support several color stacks. This package \
shows how a separate color stack can be used for transparency, \
a property besides color that works across page breaks. If the \
PDF management is used it can also be used with other engines, \
but without support for page breaks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn64852"

RPM_NAME = "texlive-transparent-2023.201.1.5svn64852-52.1.noarch.rpm"
RPM_HASH = "8dba22d36ff7fef3a47b80559c7ccca2559c3686177232634fde2be0ee69ca5d41322b6f573a5596e430c48da27b77c03fd74bab64fa87fb554331a89007932e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(transparent-nometadata.sty) \
tex(transparent.sty) \
texlive-transparent"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(auxhook.sty) \
tex(iftex.sty) \
tex(l3opacity.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
