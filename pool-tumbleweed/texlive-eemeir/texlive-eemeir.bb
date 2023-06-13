SUMMARY = "Adjust the gender of words in a document"
DESCRIPTION = "Defines macros for third-person singular pronouns (\\E, \\Em, \
\\Eir, \\Eirs), which expand differently according to a \
masculine/feminine switch. (If the switch is 'masculine', they \
would expand to 'he', 'him', 'his' and 'his'; if 'feminine', \
they would expand to 'she', 'her', 'her' and 'hers'. Apart from \
the pronouns, one can define 'word pairs', such as \
mother/father, daughter/son, and so on. Gender may be defined \
once per document, as an environment, or may be flipped on the \
fly."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-2023.201.1.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "7cb4253155398ae7d10aa06d4c9a0744a092f0058a685ea22987ae19d8da1760463754645e5add0003b025e55bddaab855928c9fe4c6b31892c169ac0c1db7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eemeir.sty) \
texlive-eemeir"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
