SUMMARY = "Computer Modern fonts including matching non-latin alphabets"
DESCRIPTION = "This is a new assembly of Computer Modern fonts including \
extensions in many directions for both Latin based languages, \
non-Latin based languages and Mathematics, all compatible in \
style to CM fonts. In addition to the Regular weight of \
Computer Modern, it provides a Book weight for heavier \
printing."
LICENSE = "LPPL-1.3c"

PV = "2023.201.4.4svn66327"

RPM_NAME = "texlive-newcomputermodern-2023.201.4.4svn66327-54.1.noarch.rpm"
RPM_HASH = "7e1977ae623fd30964ef1826d57c6a8a08f9d669f2704ef6da7f6d1e724ff1022b1269013e59544dc0acafc95789c26f0feb64a1c5d9e31708f343589683784b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(newcomputermodern.sty) \
texlive-newcomputermodern"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fspdefault.sty) \
tex(fspolddefault.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newcomputermodern-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
