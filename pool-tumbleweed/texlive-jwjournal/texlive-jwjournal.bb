SUMMARY = "A personal class for writing journals"
DESCRIPTION = "This LaTeX document class enables the user to turn simple pure \
text entries into a colorful and nicely formatted journal."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65480"

RPM_NAME = "texlive-jwjournal-2023.201.svn65480-55.1.noarch.rpm"
RPM_HASH = "bf96e139f7b9c6b93659db796e5ea3808d18623dda4f7f68d5fe4fcb14031fb0432e7860d63538a10725f578088158a10c810ece7435c7ba40dfe7da264a3afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jwjournal.cls) \
texlive-jwjournal"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ProjLib.sty) \
tex(enumitem.sty) \
tex(needspace.sty) \
tex(tcolorbox.sty) \
texlive \
texlive-einfart \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
