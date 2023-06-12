SUMMARY = "Typeset complex trees for linguists"
DESCRIPTION = "jTree uses PSTricks to enable linguists to typeset complex \
trees. The package requires use of PStricks (of course) and \
xkeyval packages. jTree is a development of, and replacement \
for, the jftree package, which is no longer available."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-2023.201.2.6svn20946-52.1.noarch.rpm"
RPM_HASH = "a6ff573679409c0a76821618f35a903d5e30322249b7fa5a52facb5a8c5fc55a3ce84a1b47c9f3c40043c5d995e3140de449bfb1bda048b7d07565aee662b85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-jtree.sty) \
tex(pst-jtree.tex) \
texlive-pst-jtree"
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
