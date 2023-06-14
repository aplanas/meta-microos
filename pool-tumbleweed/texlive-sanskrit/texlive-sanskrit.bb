SUMMARY = "Sanskrit support"
DESCRIPTION = "A font and pre-processor suitable for the production of \
documents written in Sanskrit. Type 1 versions of the fonts are \
available."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.4svn64502"

RPM_NAME = "texlive-sanskrit-2023.201.2.2.4svn64502-53.1.noarch.rpm"
RPM_HASH = "976f305f16c7c7e99fcf69691f12fa6c0fed5fe64ababd0b1a0d5a57fd708f5d7c86458a56d15c898d474177f9a159a2ec6f7985b4f23073295352c5d6ad450a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1skt.fd \
tex-skt.sty \
tex-skt10.tfm \
tex-skt8.tfm \
tex-skt9.tfm \
tex-sktb10.tfm \
tex-sktbs10.tfm \
tex-sktf10.tfm \
tex-sktfs10.tfm \
tex-skts10.tfm \
texlive-sanskrit"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
