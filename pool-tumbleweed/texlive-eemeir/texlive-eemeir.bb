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

RPM_NAME = "texlive-eemeir-2023.201.1.1bsvn15878-53.2.noarch.rpm"
RPM_HASH = "d3ed8d7e7e17ebb961082d9dd505b90d33eb392b478eeb904460ae96a5ba97f496e7c2a1d55bfec6bc3fdf54b2471e0a8d2dac8fc3577b083bf3d76ac30fd3f6"
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
