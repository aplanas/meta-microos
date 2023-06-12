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

PV = "2023.201.2.0svn60731"

RPM_NAME = "texlive-phfcc-2023.201.2.0svn60731-51.1.noarch.rpm"
RPM_HASH = "48517ac1cad79209e18d26c49aef29cc7c38d94a2584108d46b4024742e0e7396e3fc3869e414c30a0d9f3c5379b60e57688db6d54bd809797d6e5cca38f9c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfcc.sty) \
texlive-phfcc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(kvoptions.sty) \
tex(lua-ul.sty) \
tex(marginnote.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
