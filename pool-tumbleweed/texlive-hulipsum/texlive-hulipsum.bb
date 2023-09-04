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

PV = "2023.209.1.1svn56848"

RPM_NAME = "texlive-hulipsum-2023.209.1.1svn56848-54.1.noarch.rpm"
RPM_HASH = "7355f15b5b7efbf678a76d5b37a79064a1351d0252ad79839ff56293dbc7cacca73be1e0910dafdaf4cf596e13759d0f19d2b97bbcc816753cc525f3947370d9"
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
