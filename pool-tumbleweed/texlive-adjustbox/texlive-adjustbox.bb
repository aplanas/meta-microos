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

PV = "2023.209.1.3asvn64967"

RPM_NAME = "texlive-adjustbox-2023.209.1.3asvn64967-55.1.noarch.rpm"
RPM_HASH = "35c1c094aa6d51a812f6f0e3bd6701eaf6fd3dacbd8ce98c6655d334704733f20b1cff63da8f08424d561c357009f33ecb67bafcc467da21fa3d81ae80ff70ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adjcalc.sty \
tex-adjustbox.sty \
tex-tc-dvips.def \
tex-tc-pdftex.def \
tex-tc-pgf.def \
tex-tc-xetex.def \
tex-trimclip.sty \
texlive-adjustbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-collectbox.sty \
tex-graphicx.sty \
tex-ifoddpage.sty \
tex-pgf.sty \
tex-pgfmath.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
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
