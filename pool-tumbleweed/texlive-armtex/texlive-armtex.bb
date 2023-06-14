SUMMARY = "A system for writing in Armenian with TeX and LaTeX"
DESCRIPTION = "ArmTeX is a system for typesetting Armenian text with Plain TeX \
or LaTeX(2e). It may be used with input: from a standard Latin \
keyboard without any special encoding and/or support for \
Armenian letters, from any keyboard which uses an encoding that \
has Armenian letters in the second half (characters 128-255) of \
the extended ASCII table (for example ArmSCII8 Armenian \
standard), from an Armenian keyboard using UTF-8 encoding. \
Users should note that the manuals still mostly describe the \
previous version of the package (ArmTeX 2.0). However, a \
description of the new features of ArmTeX 3.0 is provided at \
the end of the README file."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0_beta4svn64182"

RPM_NAME = "texlive-armtex-2023.201.3.0_beta4svn64182-54.1.noarch.rpm"
RPM_HASH = "998f99c06b87f2534da86cd0ddaf8602ffa8115ba4a7553708a8ed9fa02cae8267e8b084b868b8624781bf6d1cc7f5c241ba051a73df327bbc7ba74836ffad62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arm.tex \
tex-armkb-a8.tex \
tex-armkb-u8.tex \
tex-armscii8.def \
tex-armtex.sty \
tex-arss.map \
tex-arssb10.tfm \
tex-arssbs10.tfm \
tex-arssr10.tfm \
tex-arsssl10.tfm \
tex-artm.map \
tex-artmb10.tfm \
tex-artmbi10.tfm \
tex-artmbs10.tfm \
tex-artmi10.tfm \
tex-artmr10.tfm \
tex-artmsl10.tfm \
tex-ot6cmr.fd \
tex-ot6cmss.fd \
tex-ot6enc.def \
texlive-armtex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-kvoptions.sty \
tex-updmap.cfg \
texlive \
texlive-armtex-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
