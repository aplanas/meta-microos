SUMMARY = "Make chapters be typeset like sections"
DESCRIPTION = "The command \\simplechapter sets up the \\chapter command not to \
number chapters, though they may possibly have a prefix, and a \
suffix (the \\simplechapterdelim command, which the user may \
alter). The \\restorechapter command restores the status quo \
ante."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn17049"

RPM_NAME = "texlive-anonchap-2023.209.1.1asvn17049-55.1.noarch.rpm"
RPM_HASH = "019f6bc6a91e111b242a935ae465a70ccfb1ff52e3df271134e35d018b77123e870904163a32a2df22c8f26dd13f118dd5edcc0391fe5f6791d246f0aead714d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anonchap.sty \
texlive-anonchap"

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
