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

PV = "2023.204.1.0.2svn66014"

RPM_NAME = "texlive-crossrefenum-2023.204.1.0.2svn66014-54.1.noarch.rpm"
RPM_HASH = "26d102381e0a5f4c0e219a1b1f95ff34c329d02f1a8d42fccda6fd59c38c639b5fad7e8d4d5dd5ff79d1101b4e3c1c208fb10df0291115f902b2a2d768e0e7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crossrefenum.sty) \
tex(crossrefenum.tex) \
tex(t-crossrefenum.tex) \
texlive-crossrefenum"

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
