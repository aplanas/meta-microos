SUMMARY = "Enables selection of 5 standard Japanese fonts for pLaTeX + dvips"
DESCRIPTION = "The package enables selection of 5 standard Japanese fonts for \
pLaTeX + dvips. It was originally written by Haruhiko Okumura \
as part of jsclasses bundle, and the TFM/VF files were \
previously distributed as part of the ptex-fonts package."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn46946"

RPM_NAME = "texlive-morisawa-2023.201.svn46946-54.1.noarch.rpm"
RPM_HASH = "25cdc46b898ffd5a37e38f7fb8828d54c66ce5e24df3926862c0a8dfe5cf74a7ca4e09eb94f2e740890492755e48b61e1cd716b8e8e362ff49ea44c454d76534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(FutoGoB101-Bold-H.tfm) \
tex(FutoGoB101-Bold-H.vf) \
tex(FutoGoB101-Bold-J.tfm) \
tex(FutoGoB101-Bold-J.vf) \
tex(FutoGoB101-Bold-V.tfm) \
tex(FutoGoB101-Bold-V.vf) \
tex(FutoMinA101-Bold-H.tfm) \
tex(FutoMinA101-Bold-H.vf) \
tex(FutoMinA101-Bold-J.tfm) \
tex(FutoMinA101-Bold-J.vf) \
tex(FutoMinA101-Bold-V.tfm) \
tex(FutoMinA101-Bold-V.vf) \
tex(GothicBBB-Medium-H.tfm) \
tex(GothicBBB-Medium-H.vf) \
tex(GothicBBB-Medium-J.tfm) \
tex(GothicBBB-Medium-J.vf) \
tex(GothicBBB-Medium-V.tfm) \
tex(GothicBBB-Medium-V.vf) \
tex(Jun101-Light-H.tfm) \
tex(Jun101-Light-H.vf) \
tex(Jun101-Light-J.tfm) \
tex(Jun101-Light-J.vf) \
tex(Jun101-Light-V.tfm) \
tex(Jun101-Light-V.vf) \
tex(Ryumin-Light-H.tfm) \
tex(Ryumin-Light-H.vf) \
tex(Ryumin-Light-J.tfm) \
tex(Ryumin-Light-J.vf) \
tex(Ryumin-Light-V.tfm) \
tex(Ryumin-Light-V.vf) \
tex(futogo-b-v.tfm) \
tex(futogo-b.tfm) \
tex(futomin-b-v.tfm) \
tex(futomin-b.tfm) \
tex(gtbbb-m-v.tfm) \
tex(gtbbb-m.tfm) \
tex(jun101-l-v.tfm) \
tex(jun101-l.tfm) \
tex(morisawa.sty) \
tex(morisawa5.map) \
tex(ryumin-l-v.tfm) \
tex(ryumin-l.tfm) \
texlive-morisawa"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
