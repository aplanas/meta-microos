SUMMARY = "Hyphenation for letterspacing, underlining, and more"
DESCRIPTION = "The package provides hyphenable spacing out (letterspacing), \
underlining, striking out, etc., using the TeX hyphenation \
algorithm to find the proper hyphens automatically. It also \
provides a mechanism that can be used to implement similar \
tasks, that have to treat text syllable by syllable. This is \
shown in two examples. This version is a merge of the original \
soul package from Melchior Franz and the soulutf8 package from \
Heiko Oberdiek and supports also UTF8."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn65908"

RPM_NAME = "texlive-soul-2023.201.3.0svn65908-57.1.noarch.rpm"
RPM_HASH = "0e9ee86e7e81e846b074cb22f67c07ed1e1e7856be73cf26ecc061f7bcbb67dc5c4c2db5900f372c48d6a3ffb010b9d4016e9e8914019f8ad0ccd9551616595c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(soul-ori.sty) \
tex(soul.sty) \
tex(soulutf8.sty) \
texlive-soul"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etexcmds.sty) \
tex(infwarerr.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
