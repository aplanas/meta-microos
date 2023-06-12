SUMMARY = "Thai labels in enumerate environments"
DESCRIPTION = "This LaTeX package provides a command to use Thai numerals or \
characters as labels in enumerate environments. Once the \
package is loaded with \\usepackage{thaienum} you can use labels \
such as \\thainum* or \\thaimultialph* in conjunction with the \
package enumitem. Concrete examples are given in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-2023.201.0.0.2svn44140-54.1.noarch.rpm"
RPM_HASH = "83ec0ecfe9dc2d905bb4efd0f114fffaeaed71d7bcb54693c602a898057c9bc9b99516b89d10dec3e7be3b877167a9527cfc335668246c1e3fe9a2234ab3def6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thaienum.sty) \
texlive-thaienum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphalph.sty) \
tex(enumitem.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
