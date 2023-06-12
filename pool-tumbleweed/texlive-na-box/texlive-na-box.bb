SUMMARY = "Arabic-aware version of pas-cours package"
DESCRIPTION = "This is a modified version of the pas-cours package made \
compatible with XeLaTeX/polyglossia to write arabic documents \
with fancy boxed theorem-alike environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45130"

RPM_NAME = "texlive-na-box-2023.201.1.0svn45130-54.1.noarch.rpm"
RPM_HASH = "76c1fc8873b92ab569378dd505cca1ff62410bc2f419e63e8d7ae5599b7ea9f6cad7a0c12c2f54e7da4085f79ea86a0ea67a93dd6fa55fc1e2be3a23594278da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(na-box.sty) \
texlive-na-box"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(enumitem.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
