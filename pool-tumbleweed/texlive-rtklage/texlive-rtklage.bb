SUMMARY = "A package for German lawyers"
DESCRIPTION = "RATeX is a newly developed bundle of packages and classes \
provided for German lawyers. Now in the early beginning it only \
contains rtklage, a class to make lawsuits."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rtklage-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "7deed4b0a51de0ca91d7cca88475dd3655e2f4b468f6fc8e9f4e8aee766359ac41be1455c861f49cbe2ca8dcd882fac6c9623ea78608573dd108697576303c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rtklage.cls \
texlive-rtklage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphanum.sty \
tex-babel.sty \
tex-calc.sty \
tex-color.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-scrdate.sty \
tex-twoopt.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
