SUMMARY = "A Greek and Latin font based on Bodoni"
DESCRIPTION = "Bodoni's Greek fonts in the 18th century broke, for the first \
time, with the Byzantine cursive tradition of Greek fonts. GFS \
Bodoni resurrects his work for general use. The font family \
supports both Greek and Latin letters. LaTeX support of the \
fonts is provided, offering OT1, T1 and LGR encodings. The \
fonts themselves are provided in Adobe Type 1 and OpenType \
formats."
LICENSE = "OFL-1.1"

PV = "2023.201.1.01svn28484"

RPM_NAME = "texlive-gfsbodoni-2023.201.1.01svn28484-52.1.noarch.rpm"
RPM_HASH = "ba3a312d6e821fcb14cd36d45d58d8f0200aa04872d86429f6cd19392f892885c741840d29bc2a0763025f4fcaadfe346573a20498c3886a08903d872b55cc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bodoni.enc \
tex-bodonib8a.tfm \
tex-bodonib8a.vf \
tex-bodonib8r.tfm \
tex-bodonib9a.tfm \
tex-bodonib9a.vf \
tex-bodonib9r.tfm \
tex-bodonibi8a.tfm \
tex-bodonibi8a.vf \
tex-bodonibi8r.tfm \
tex-bodonibi9a.tfm \
tex-bodonibi9a.vf \
tex-bodonibi9r.tfm \
tex-bodonibo8a.tfm \
tex-bodonibo8a.vf \
tex-bodonibo8r.tfm \
tex-bodonibo9a.tfm \
tex-bodonibo9a.vf \
tex-bodonibo9r.tfm \
tex-bodonidenomnums.enc \
tex-bodonidenomnums8a.tfm \
tex-bodonidenomnums8a.vf \
tex-bodonidenomnums8r.tfm \
tex-bodoniec.enc \
tex-bodoniecsc.enc \
tex-bodoniel.enc \
tex-bodonielsc.enc \
tex-bodonii8a.tfm \
tex-bodonii8a.vf \
tex-bodonii8r.tfm \
tex-bodonii9a.tfm \
tex-bodonii9a.vf \
tex-bodonii9r.tfm \
tex-bodoninumnums.enc \
tex-bodoninumnums8a.tfm \
tex-bodoninumnums8a.vf \
tex-bodoninumnums8r.tfm \
tex-bodonio8a.tfm \
tex-bodonio8a.vf \
tex-bodonio8r.tfm \
tex-bodonio9a.tfm \
tex-bodonio9a.vf \
tex-bodonio9r.tfm \
tex-bodonirg8a.tfm \
tex-bodonirg8a.vf \
tex-bodonirg8r.tfm \
tex-bodonirg9a.tfm \
tex-bodonirg9a.vf \
tex-bodonirg9r.tfm \
tex-bodonisc.enc \
tex-bodonisc8a.tfm \
tex-bodonisc8a.vf \
tex-bodonisc8r.tfm \
tex-bodonisc9a.tfm \
tex-bodonisc9a.vf \
tex-bodonisc9r.tfm \
tex-bodonisco8a.tfm \
tex-bodonisco8a.vf \
tex-bodonisco8r.tfm \
tex-bodonisco9a.tfm \
tex-bodonisco9a.vf \
tex-bodonisco9r.tfm \
tex-bodonitabnums.enc \
tex-bodonitabnums8a.tfm \
tex-bodonitabnums8a.vf \
tex-bodonitabnums8r.tfm \
tex-gbodonib6a.tfm \
tex-gbodonib6a.vf \
tex-gbodonib6r.tfm \
tex-gbodonibi6a.tfm \
tex-gbodonibi6a.vf \
tex-gbodonibi6r.tfm \
tex-gbodonibo6a.tfm \
tex-gbodonibo6a.vf \
tex-gbodonibo6r.tfm \
tex-gbodonii6a.tfm \
tex-gbodonii6a.vf \
tex-gbodonii6r.tfm \
tex-gbodonio6a.tfm \
tex-gbodonio6a.vf \
tex-gbodonio6r.tfm \
tex-gbodonio9a.tfm \
tex-gbodonio9a.vf \
tex-gbodonirg6a.tfm \
tex-gbodonirg6a.vf \
tex-gbodonirg6r.tfm \
tex-gbodonisc6a.tfm \
tex-gbodonisc6a.vf \
tex-gbodonisc6r.tfm \
tex-gbodonisco6a.tfm \
tex-gbodonisco6a.vf \
tex-gbodonisco6r.tfm \
tex-gfsbodoni.map \
tex-gfsbodoni.sty \
tex-lgrbodoni.fd \
tex-ot1bodoni.fd \
tex-t1bodoni.fd \
tex-ubodoninums.fd \
texlive-gfsbodoni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsbodoni-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
