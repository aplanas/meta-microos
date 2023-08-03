SUMMARY = "Typesetting science fiction/fantasy manuscripts"
DESCRIPTION = "The class is designed for typesetting science fiction and \
fantasy manuscripts. Sffms now includes several options for \
specific publishers as well as extensive documentation aimed at \
new LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-sffms-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "627d9844f13dff610d8d087c18388b4dfa31642f04f13d9f783baf82b7f8cab3b34bfcec4ffcec2a31ea06b5b462573535300dcde020484d3d7c4532cf79111c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sffdumb.sty \
tex-sffms.cls \
tex-sffsmart.sty \
texlive-sffms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-report.cls \
tex-setspace.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
