SUMMARY = "Directly embed flash movies into PDF files"
DESCRIPTION = "The package allows direct embedding of flash movies into PDF \
files. It is designed for use with pdfLaTeX. The package takes \
advantage of the embedded Adobe Flash player in Adobe Reader 9; \
the reader is invoked with the 'rich media annotation' feature, \
described in 'Adobe Supplement to the ISO 32000 BaseVersion: \
1.7 ExtensionLevel: 3'. This method of embedding movies is \
attractive since it removes all platform dependencies; however, \
the user is required to use Acrobat 9."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-2023.201.0.0.4svn25768-52.1.noarch.rpm"
RPM_HASH = "a304f563964fdda9d9322ffd80a0d7f1302f4c8f4132927a80f11817bb9c4af32ab46218987a5f1b38af655b925a98a4874a8111589034c09a060f6b38435c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flashmovie.sty) \
texlive-flashmovie"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
