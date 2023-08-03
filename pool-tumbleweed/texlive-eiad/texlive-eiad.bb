SUMMARY = "Traditional style Irish fonts"
DESCRIPTION = "In both lower and upper case 32 letters are defined (18 'plain' \
ones, 5 long vowels and 9 aspirated consonants). The ligature \
'agus' is also made available. The remaining characters \
(digits, punctuation and accents) are inherited from the \
Computer Modern family of fonts. The font definitions use code \
from the sauter fonts, so those fonts have to be installed \
before using eiad. OT1*.fd files are provided for use with \
LaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eiad-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "49f7722b235e9bb160959b9dc268093ab06dcd1e8e8dc0f89fd0e84cee742344604f3387fca4b0d08be72144e6f0166955d8abf7abc02c729350cbbcf79f73a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OT1eiad.fd \
tex-OT1eiadcc.fd \
tex-OT1eiadss.fd \
tex-OT1eiadtt.fd \
tex-eiadb10.tfm \
tex-eiadbx10.tfm \
tex-eiadbxi10.tfm \
tex-eiadbxsl10.tfm \
tex-eiadccsc10.tfm \
tex-eiadci10.tfm \
tex-eiadcr10.tfm \
tex-eiadcsc10.tfm \
tex-eiadcsl10.tfm \
tex-eiadcslc9.tfm \
tex-eiaddunh10.tfm \
tex-eiadff10.tfm \
tex-eiadfi10.tfm \
tex-eiadfib8.tfm \
tex-eiadi10.tfm \
tex-eiaditt10.tfm \
tex-eiadr10.tfm \
tex-eiadr12.tfm \
tex-eiadr17.tfm \
tex-eiadsl10.tfm \
tex-eiadsltt10.tfm \
tex-eiadss10.tfm \
tex-eiadssbx10.tfm \
tex-eiadssdc10.tfm \
tex-eiadssi10.tfm \
tex-eiadssq8.tfm \
tex-eiadssqi8.tfm \
tex-eiadtcsc10.tfm \
tex-eiadtt10.tfm \
tex-eiadvtt10.tfm \
texlive-eiad"

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
