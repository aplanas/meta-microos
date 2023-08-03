SUMMARY = "Thai labels in enumerate environments"
DESCRIPTION = "This LaTeX package provides a command to use Thai numerals or \
characters as labels in enumerate environments. Once the \
package is loaded with \\usepackage{thaienum} you can use labels \
such as \\thainum* or \\thaimultialph* in conjunction with the \
package enumitem. Concrete examples are given in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-2023.209.0.0.2svn44140-55.1.noarch.rpm"
RPM_HASH = "b955ecb0d49495391f29e1399ae84aeee32589d17543f96f5abf905f14428329f4bda639495d0de87bd5e00dc615b8ae394add538415b5b55f2258b496256822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thaienum.sty \
texlive-thaienum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-enumitem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
