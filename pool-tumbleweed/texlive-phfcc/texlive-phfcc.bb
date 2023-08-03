SUMMARY = "Convenient inline commenting in collaborative documents"
DESCRIPTION = "Easily define helper macros to insert comments in a LaTeX \
document. A convenient syntax enables you to mark text \
additions (e.g., '... \\phf{I'm adding this text} ...' or '... \
\\phf I'm adding this text\\endphf ...'), an in-line comment \
(e.g., '... We're the best \\phf[I'm not sure about this.] \
...'), and text removals (e.g., '... \\phf*{remove me} ...'). \
New colors are assigned automatically to each commenter by \
default, and the appearance of all comments is highly \
customizable."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn60731"

RPM_NAME = "texlive-phfcc-2023.209.2.0svn60731-52.1.noarch.rpm"
RPM_HASH = "6050456a64cad60ee635f0e38df4fa3237ae410c428f547043eb840665c18347c488c250501ebc6739f46ad0c8acd9749c46968286b678a3ce72562b9ef57685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfcc.sty \
texlive-phfcc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-lua-ul.sty \
tex-marginnote.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
