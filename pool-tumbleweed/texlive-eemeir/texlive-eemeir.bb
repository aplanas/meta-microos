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

RPM_NAME = "texlive-eemeir-2023.209.1.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "d3dc95064f8e606c8937776e6667570e62456801cfb3b1fd99c879105b6fc6fdf03943d7e62beccc210154040c79c93d0f78b946c5b1a27ab718ce44e9faf19d"
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
