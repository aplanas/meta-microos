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

PV = "2023.209.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-2023.209.1.1bsvn15878-54.2.noarch.rpm"
RPM_HASH = "16ee46c9f97981944aa9a43e36d8621b750f3f9a8f594ea25f8b52238e636d7af36291af75b2de76d1b068396a417ace8ce5a7c3fc6baa2e045530d777dea54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eemeir.sty \
texlive-eemeir"

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
