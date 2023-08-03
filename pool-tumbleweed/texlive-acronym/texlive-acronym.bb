SUMMARY = "Expand acronyms at least once"
DESCRIPTION = "This package ensures that all acronyms used in the text are \
spelled out in full at least once. It also provides an \
environment to build a list of acronyms used. The package is \
compatible with pdf bookmarks. The package requires the suffix \
package, which in turn requires that it runs under e-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.47svn54758"

RPM_NAME = "texlive-acronym-2023.209.1.47svn54758-55.1.noarch.rpm"
RPM_HASH = "304bf97b228bf58ec818790e27410ef170662b6f2efe24866b912a9420f9d4dedd56de1741ee6139ddfc6d0e639376c4d9ad125b68ea30cc663b6f063c91c96f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acronym.sty \
texlive-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-suffix.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
