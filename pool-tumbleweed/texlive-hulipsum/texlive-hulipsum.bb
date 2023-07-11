SUMMARY = "Hungarian dummy text (Lorum ipse)"
DESCRIPTION = "Lorem ipsum is an improper Latin filler dummy text, cf. the \
lipsum package. It is commonly used for demonstrating the \
textual elements of a document template. Lorum ipse is a \
Hungarian variation of Lorem ipsum. (Lorum is a Hungarian card \
game, and ipse is a Hungarian slang word meaning bloke.) With \
this package you can typeset 150 paragraphs of Lorum ipse. All \
paragraphs are taken with permission from \
http://www.lorumipse.hu. Thanks to Lorum Ipse Lab (Viktor Nagy \
and David Takacs) for their work."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn56848"

RPM_NAME = "texlive-hulipsum-2023.208.1.1svn56848-53.1.noarch.rpm"
RPM_HASH = "3f507a21a9df3f4d7f4994410f978ed1a39916d49c30db987a86a709df5aa75ad96d7624df9a282317259eb6578ba17abe27926d2f6ae11ec7b63bb465be2b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hulipsum.sty \
texlive-hulipsum"

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
