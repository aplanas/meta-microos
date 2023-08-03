SUMMARY = "Computer Modern fonts including matching non-latin alphabets"
DESCRIPTION = "This is a new assembly of Computer Modern fonts including \
extensions in many directions for both Latin based languages, \
non-Latin based languages and Mathematics, all compatible in \
style to CM fonts. In addition to the Regular weight of \
Computer Modern, it provides a Book weight for heavier \
printing."
LICENSE = "LPPL-1.3c"

PV = "2023.209.4.4svn66327"

RPM_NAME = "texlive-newcomputermodern-2023.209.4.4svn66327-55.1.noarch.rpm"
RPM_HASH = "109a6872d95759f5f36fe2ac327e35b30bcb95b790a2eabe69ba6538ab0a508565551bed5534b3b078ffc0b5d19f45416c380085ec97cd5cd85076ae59d583f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newcomputermodern.sty \
texlive-newcomputermodern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fspdefault.sty \
tex-fspolddefault.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newcomputermodern-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
