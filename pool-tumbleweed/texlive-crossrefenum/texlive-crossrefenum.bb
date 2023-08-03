SUMMARY = "Smart typesetting of enumerated cross-references for various TeX formats"
DESCRIPTION = "crossrefenum lets TeX manage the formatting of bunches of \
cross-references for you. It features: Automatic collapsing of \
references; Support for references by various criteria, \
including page and note number, line number in ConTeXt and \
edpage and edline when used in conjunction with reledmac \
Handling of references combining two criteria (e.g. by page and \
note number) Extension mechanisms to add support to other types \
of references without modifying the internal macros. Note that \
sorting is not supported. I assume that users know in what \
order the labels they refer to appear in their document. It is \
written in Plain TeX as much as possible in order to make it \
compatible with a wide array of formats. For the moment, it \
works out of the box with ConTeXt and LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.2svn66014"

RPM_NAME = "texlive-crossrefenum-2023.209.1.0.2svn66014-55.1.noarch.rpm"
RPM_HASH = "c37e0a47af9bed841d2f06ae7c570f2b785f8317434b4f207149a2c15d4f917a76aef29ba3d529a1ff4ffe329c9569cd77a2b6c2c0cdfb344838b3ffaeb4a4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossrefenum.sty \
tex-crossrefenum.tex \
tex-t-crossrefenum.tex \
texlive-crossrefenum"

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
