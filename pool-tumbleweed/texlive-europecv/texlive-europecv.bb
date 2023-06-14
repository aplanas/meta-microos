SUMMARY = "Unofficial class for European curricula vitae"
DESCRIPTION = "The europecv class is an unofficial LaTeX implementation of the \
standard model for curricula vitae (the 'Europass CV') as \
recommended by the European Commission. Although primarily \
intended for users in the European Union, the class is flexible \
enough to be used for any kind of curriculum vitae. The class \
has localisations for all the official languages of the EU \
(plus Catalan), as well as options permitting input in UTF-8 \
and koi8-r."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64037"

RPM_NAME = "texlive-europecv-2023.201.svn64037-52.1.noarch.rpm"
RPM_HASH = "e092d0edda47768dbdeededd332177fea8376ba6079285ab9c0a0296b1c267150c7f2dc121272121f9841b63e5d5327daaa79ee8c3eba8386e21aaca0cc31cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecvbg.def \
tex-ecvca.def \
tex-ecvcs.def \
tex-ecvda.def \
tex-ecvde.def \
tex-ecven.def \
tex-ecves.def \
tex-ecvet.def \
tex-ecvfi.def \
tex-ecvfr.def \
tex-ecvgl.def \
tex-ecvgr.def \
tex-ecvhu.def \
tex-ecvis.def \
tex-ecvit.def \
tex-ecvlt.def \
tex-ecvlv.def \
tex-ecvmt.def \
tex-ecvnl.def \
tex-ecvno.def \
tex-ecvpl.def \
tex-ecvpt.def \
tex-ecvro.def \
tex-ecvsk.def \
tex-ecvsl.def \
tex-ecvsr.def \
tex-ecvsv.def \
tex-europecv.cls \
texlive-europecv"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-combelow.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-longtable.sty \
tex-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
