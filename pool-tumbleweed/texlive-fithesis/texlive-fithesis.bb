SUMMARY = "Thesis class and template for Masaryk University (Brno, Czech Republic)"
DESCRIPTION = "A document class for the typesetting of theses at the Masaryk \
University (Brno, Czech Republic). The class has been designed \
for easy extensibility by style and locale files of other \
academic institutions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn64135"

RPM_NAME = "texlive-fithesis-2023.209.1.1.0svn64135-53.1.noarch.rpm"
RPM_HASH = "195eaf5785d48f3241873da4246361a43ff6958590e78a8b0c23fd3af1b4168308ea218a5a4e094d7b47d360025df6f0a916c7dcebb54ddb0e3d04a16adfd15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fithesis-base.sty \
tex-fithesis-czech.def \
tex-fithesis-english.def \
tex-fithesis-mu-10.clo \
tex-fithesis-mu-11.clo \
tex-fithesis-mu-12.clo \
tex-fithesis-mu-base.sty \
tex-fithesis-mu-econ.sty \
tex-fithesis-mu-fi.sty \
tex-fithesis-mu-fsps.sty \
tex-fithesis-mu-fss.sty \
tex-fithesis-mu-law.sty \
tex-fithesis-mu-med.sty \
tex-fithesis-mu-ped.sty \
tex-fithesis-mu-pharm.sty \
tex-fithesis-mu-phil.sty \
tex-fithesis-mu-sci.sty \
tex-fithesis-slovak.def \
tex-fithesis.cls \
tex-fithesis2.cls \
tex-fithesis3.cls \
tex-fithesis4.cls \
texlive-fithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-cmap.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-ltxcmds.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
