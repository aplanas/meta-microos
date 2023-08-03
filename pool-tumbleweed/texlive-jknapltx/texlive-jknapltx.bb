SUMMARY = "Miscellaneous packages by Joerg Knappen"
DESCRIPTION = "Miscellaneous macros by Jorg Knappen, including: represent \
counters in greek; Maxwell's non-commutative division; \
latin1jk, latin2jk and latin3jk, which are their inputenc \
definition files that allow verbatim input in the respective \
ISO Latin codes; blackboard bold fonts in maths; use of RSFS \
fonts in maths; extra alignments for \\parboxes; swap Roman and \
Sans fonts; transliterate semitic languages; patches to make \
(La)TeX formulae embeddable in SGML; use maths 'minus' in text \
as appropriate; simple Young tableaux."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-jknapltx-2023.209.svn19440-56.1.noarch.rpm"
RPM_HASH = "89b81ae2abf5c060ea03784e3f02cb1da8ac780e3f91e2f1ef84f1e533beedb429a4dd5d5d11075460e53f79231b4106f4bfe03ae5d223f443f64a02b68a4df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greekctr.sty \
tex-holtpolt.sty \
tex-latin1jk.def \
tex-latin2jk.def \
tex-latin3jk.def \
tex-mathbbol.sty \
tex-mathrsfs.sty \
tex-parboxx.sty \
tex-sans.sty \
tex-semtrans.sty \
tex-sgmlcmpt.sty \
tex-smartmn.sty \
tex-tccompat.sty \
tex-ursfs.fd \
tex-ustmary.fd \
tex-young.sty \
texlive-jknapltx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-inputenc.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
