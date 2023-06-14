SUMMARY = "Macros for managing large font collections"
DESCRIPTION = "OFS (Olsak's Font System) is a set of Plain TeX and LaTeX \
macros for managing large font collections; it has been used by \
Czech/Slovak users for many years. Main features include: \
Mapping from long names of fonts to the metric file name. The \
user can specify only exact long names in documents. Support \
for many font encodings. Printing of catalogues of fonts and \
test samples of font families; the interactive macro \\showfonts \
shows all font families you have installed via OFS. The user \
interface is the same for Plain TeX and for LaTeX, but the \
implementation differs: the LaTeX variant of OFS uses NFSS, but \
the Plain variant implements its own font management (which may \
even be better than NFSS) Support for math fonts including TX \
fonts."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn16991"

RPM_NAME = "texlive-ofs-2023.201.svn16991-54.1.noarch.rpm"
RPM_HASH = "428186bd49ddc6276ba36ca2c96208fcd5730c2470f5a9e59cde73e5e6777f7d76b20a02afb36256c8665f69faede1f9a8ba115b4905422d0e665b0ec296ae56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a117.tex \
tex-a35.sty \
tex-a35.tex \
tex-allfonts.sty \
tex-allfonts.tex \
tex-amsfn.tex \
tex-mtfn.tex \
tex-ofs-6a.tex \
tex-ofs-6c.tex \
tex-ofs-6k.tex \
tex-ofs-6s.tex \
tex-ofs-6t.tex \
tex-ofs-6x.tex \
tex-ofs-6y.tex \
tex-ofs-8c.tex \
tex-ofs-8t.tex \
tex-ofs-8x.tex \
tex-ofs-8z.tex \
tex-ofs-ams.tex \
tex-ofs-cm.tex \
tex-ofs-mt.tex \
tex-ofs-ps.tex \
tex-ofs-px.tex \
tex-ofs-slt.tex \
tex-ofs-tx.tex \
tex-ofs.sty \
tex-ofs.tex \
tex-ofsdef.tex \
tex-pantyk.tex \
tex-txfn.tex \
texlive-ofs"

RDEPENDS:${PN} += "/bin/sh \
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
