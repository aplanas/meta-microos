SUMMARY = "Graphics package-alike macros for 'general' boxes"
DESCRIPTION = "The package provides several macros to adjust boxed content. \
One purpose is to supplement the standard graphics package, \
which defines the macros \\resizebox, \\scalebox and \\rotatebox , \
with the macros\\trimbox and \\clipbox. The main feature is the \
general \\adjustbox macro which extends the 'key=value' \
interface of \\includegraphics from the graphics package and \
applies it to general text content. Additional provided box \
macros are \\lapbox, \\marginbox, \\minsizebox, \\maxsizebox and \
\\phantombox. All macros use the collectbox package to read the \
content as a box and not as a macro argument. This allows for \
all forms of content including special material like verbatim \
content. A special feature of collectbox is used to provide \
matching environments with the identical names as the macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn64967"

RPM_NAME = "texlive-adjustbox-2023.201.1.3asvn64967-54.1.noarch.rpm"
RPM_HASH = "f10ca013317fd2d4aeca416f56f462dceee2930b71dcde59a65efa0ed78ec0ad66225426eb3165f11b001285324292db756a43fdbe590864aa18ccdee314494e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(adjcalc.sty) \
tex(adjustbox.sty) \
tex(tc-dvips.def) \
tex(tc-pdftex.def) \
tex(tc-pgf.def) \
tex(tc-xetex.def) \
tex(trimclip.sty) \
texlive-adjustbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(collectbox.sty) \
tex(graphicx.sty) \
tex(ifoddpage.sty) \
tex(pgf.sty) \
tex(pgfmath.sty) \
tex(varwidth.sty) \
tex(xkeyval.sty) \
texlive \
texlive-collectbox \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
