SUMMARY = "Convert (La)TeX to HTML/XML"
DESCRIPTION = "A converter from TeX and LaTeX to SGML-based formats such as \
(X)HTML, MathML, OpenDocument, and Docbook, providing a \
configurable (La)TeX-based authoring system for hypertext. \
TeX4ht does not independently parse (La)TeX source (so it \
avoids the difficulties encountered by many other converters, \
arising from the irregularity of (La)TeX syntax). Instead, \
TeX4ht uses (La)TeX itself (with myriad macro modifications) to \
produce a helper DVI file that it can then process. This \
technique allows TeX4ht to approach the robustness \
characteristic of restricted-syntax systems such as gellmu. \
Full releases of TeX4ht are no longer made, both because it is \
technically difficult to do so and because their utility is \
questionable. Nevertheless, TeX4ht is actively maintained. So, \
current source files are held on CTAN, and updated from the \
development repository frequently. Creating the myriad derived \
files from them is nontrivial, and generally done with the \
Makefile in development, from which the TeX4ht package in TeX \
Live is updated."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66530"

RPM_NAME = "texlive-tex4ht-2023.209.svn66530-55.1.noarch.rpm"
RPM_HASH = "cd2742f06cd1dd07b5b5a80c93e6ed073a49a49c38a3fb7957f01342f160f590668801bffd0bb0773baea4e8420d24bca68837b71a38d84ddeaac85bf38b2026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-m-tex4ht.tex \
tex-tex4ht.jar \
tex-tex4ht.sty \
texlive-tex4ht"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
perl-File--Basename \
perl-File--Copy \
perl-File--Path \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tex4ht-bin"

inherit rpm
