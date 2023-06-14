SUMMARY = "Computer Modern fonts"
DESCRIPTION = "Knuth's final iteration of his re-interpretation of a c.19 \
Modern-style font from Monotype. The family is comprehensive, \
offering both sans and roman styles, and a monospaced font, \
together with mathematics fonts closely integrated with the \
mathematical facilities of TeX itself. The base fonts are \
distributed as Metafont source, but autotraced PostScript Type \
1 versions are available (one version in the AMS fonts \
distribution, and also the BaKoMa distribution). The Computer \
Modern fonts have inspired many later families, notably the \
European Computer Modern and the Latin Modern families."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn57963"

RPM_NAME = "texlive-cm-2023.201.svn57963-53.1.noarch.rpm"
RPM_HASH = "998929b97e570a6d5ed05311cf8d1599e9fea1cda4cc899a75acaa65c1012730406c165d371e3691de93f1a25fc25d06f5781a65b39d966b03801e3d311609a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmb10.tfm \
tex-cmbsy10.tfm \
tex-cmbx10.tfm \
tex-cmbx12.tfm \
tex-cmbx5.tfm \
tex-cmbx6.tfm \
tex-cmbx7.tfm \
tex-cmbx8.tfm \
tex-cmbx9.tfm \
tex-cmbxsl10.tfm \
tex-cmbxti10.tfm \
tex-cmcsc10.tfm \
tex-cmdunh10.tfm \
tex-cmex10.tfm \
tex-cmff10.tfm \
tex-cmfi10.tfm \
tex-cmfib8.tfm \
tex-cminch.tfm \
tex-cmitt10.tfm \
tex-cmmi10.tfm \
tex-cmmi12.tfm \
tex-cmmi5.tfm \
tex-cmmi6.tfm \
tex-cmmi7.tfm \
tex-cmmi8.tfm \
tex-cmmi9.tfm \
tex-cmmib10.tfm \
tex-cmr10.tfm \
tex-cmr12.tfm \
tex-cmr17.tfm \
tex-cmr5.tfm \
tex-cmr6.tfm \
tex-cmr7.tfm \
tex-cmr8.tfm \
tex-cmr9.tfm \
tex-cmsl10.tfm \
tex-cmsl12.tfm \
tex-cmsl8.tfm \
tex-cmsl9.tfm \
tex-cmsltt10.tfm \
tex-cmss10.tfm \
tex-cmss12.tfm \
tex-cmss17.tfm \
tex-cmss8.tfm \
tex-cmss9.tfm \
tex-cmssbx10.tfm \
tex-cmssdc10.tfm \
tex-cmssi10.tfm \
tex-cmssi12.tfm \
tex-cmssi17.tfm \
tex-cmssi8.tfm \
tex-cmssi9.tfm \
tex-cmssq8.tfm \
tex-cmssqi8.tfm \
tex-cmsy10.tfm \
tex-cmsy5.tfm \
tex-cmsy6.tfm \
tex-cmsy7.tfm \
tex-cmsy8.tfm \
tex-cmsy9.tfm \
tex-cmtcsc10.tfm \
tex-cmtex10.tfm \
tex-cmtex8.tfm \
tex-cmtex9.tfm \
tex-cmtext-bsr-interpolated.map \
tex-cmti10.tfm \
tex-cmti12.tfm \
tex-cmti7.tfm \
tex-cmti8.tfm \
tex-cmti9.tfm \
tex-cmtt10.tfm \
tex-cmtt12.tfm \
tex-cmtt8.tfm \
tex-cmtt9.tfm \
tex-cmu10.tfm \
tex-cmvtt10.tfm \
texlive-cm"

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
texlive-scripts-bin"

inherit rpm
