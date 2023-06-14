SUMMARY = "Semaphore alphabet font"
DESCRIPTION = "These fonts represent semaphore in a highly schematic, but very \
clear, fashion. The fonts are provided as Metafont source, and \
in both OpenType and Adobe Type 1 formats."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn18651"

RPM_NAME = "texlive-semaphor-2023.201.svn18651-53.1.noarch.rpm"
RPM_HASH = "a05d4e954c9fc927f06e8ea5e371e2a83470b19275e0e611986720dbd9eff4d5b463edc33a21933cc528814538713e9973e952224fcc8cbe1c4719577c6d58a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-il2semaf.fd \
tex-semaf.fd \
tex-semaf.map \
tex-semaf.tex \
tex-smfb10.enc \
tex-smfb10.tfm \
tex-smfbsl10.enc \
tex-smfbsl10.tfm \
tex-smfeb10.enc \
tex-smfeb10.tfm \
tex-smfebsl10.enc \
tex-smfebsl10.tfm \
tex-smfer10.enc \
tex-smfer10.tfm \
tex-smfesl10.enc \
tex-smfesl10.tfm \
tex-smfett10.enc \
tex-smfett10.tfm \
tex-smfpb10.enc \
tex-smfpb10.tfm \
tex-smfpbsl10.enc \
tex-smfpbsl10.tfm \
tex-smfpr10.enc \
tex-smfpr10.tfm \
tex-smfpsl10.enc \
tex-smfpsl10.tfm \
tex-smfptt10.enc \
tex-smfptt10.tfm \
tex-smfr10.enc \
tex-smfr10.tfm \
tex-smfsl10.enc \
tex-smfsl10.tfm \
tex-smftt10.enc \
tex-smftt10.tfm \
tex-t-type-semaf.tex \
texlive-semaphor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-semaphor-fonts"

inherit rpm
