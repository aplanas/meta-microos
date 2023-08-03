SUMMARY = "Typeset dramas, both in verse and in prose"
DESCRIPTION = "This package is intended for typesetting drama of any length. \
It provides two environments for typesetting dialogues in prose \
or in verse; new document divisions corresponding to acts and \
scenes; macros that control the appearance of characters and \
stage directions; and automatic generation of a `dramatis \
personae' list."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2esvn35866"

RPM_NAME = "texlive-dramatist-2023.209.1.2esvn35866-53.1.noarch.rpm"
RPM_HASH = "ee1b6dd65c3532154cf60466837c88cfadc2ad45fdc599d13864f2f27d69e49e67bde08f0b258029be7c327d7e400b36a70a89163649d9bc83d01886b6de3bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dramatist.sty \
texlive-dramatist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
