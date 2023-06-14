SUMMARY = "Associate a pop-up window and tooltip with PDF hyperlinks"
DESCRIPTION = "The cooltooltips package enables a document to contain \
hyperlinks that pop up a brief tooltip when the mouse moves \
over them and also open a small window containing additional \
text. cooltooltips provides the mechanism used by the Visual \
LaTeX FAQ to indicate the question that each hyperlink answers."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-2023.204.1.1svn60201-54.1.noarch.rpm"
RPM_HASH = "32bdf83007ffc4ebc773e88e4a0fd57db704c51ad57c8f235e3c0a38c840c20faaf4c4b65af83d2bf52065a44feac666348e2970388bba5953354fac529c3374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooltooltips.sty \
texlive-cooltooltips"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
