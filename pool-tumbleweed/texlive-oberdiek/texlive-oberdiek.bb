SUMMARY = "A bundle of packages submitted by Heiko Oberdiek"
DESCRIPTION = "The bundle comprises packages to provide: aliascnt: 'alias \
counters'; bmpsize: get bitmap size and resolution data; \
centernot: a horizontally-centred \\not symbol; chemarr: \
extensible chemists' reaction arrows; classlist: record \
information about document class(es) used; colonequals: poor \
man's mathematical relation symbols; dvipscol: dvips colour \
stack management; engord: define counter-printing operations \
producing English ordinals; eolgrab: collect arguments \
delimited by end of line; flags: setting and clearing flags in \
bit fields and converting the bit field into a decimal number; \
holtxdoc: extra documentation macros; hypbmsec: bookmarks in \
sectioning commands; hypcap: anjusting anchors of captions; \
hypgotoe: experimental package for links to embedded files; \
hyphsubst: substitute hyphenation patterns; ifdraft: switch for \
option draft; iflang: provides expandable checks for the \
current language; pdfcolparallel: fixes colour problems in \
package parallel; pdfcolparcolumns: fixes colour problems in \
package parcolumns; pdfcrypt: setting PDF encryption; \
pdfrender: control PDF rendering modes; protecteddef: define a \
command that protected against expansion; resizegather: \
automatically resize overly large equations; rotchiffre: \
performs simple rotation cyphers; scrindex: redefines \
environment 'theindex' of package 'index', if a class from \
KOMA-Script is loaded; setouterhbox: set \\hbox in outer \
horizontal mode; settobox: getting box sizes; stackrel: \
extensions of the \\stackrel command; stampinclude: selects the \
files for \\include by inspecting the timestamp of the .aux \
file(s); tabularht: tabulars with height specification; \
tabularkv: key value interface for tabular parameters; \
telprint: print German telephone numbers; thepdfnumber: \
canonical numbers for use in PDF files and elsewhere; twoopt: \
commands with two optional arguments; Each of the packages is \
represented by two files, a .dtx (documented source) and a PDF \
file; the .ins file necessary for installation is extracted by \
running the .dtx file with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65521"

RPM_NAME = "texlive-oberdiek-2023.209.svn65521-55.1.noarch.rpm"
RPM_HASH = "d200da5bc983c62269aa6840a478be4255d929513924eb6fa14b76a0d62af7071d07613f978fd5c83b7a6e7793f75009da060da8f076fe230c48cb8d0fcec740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aliascnt.sty \
tex-bmpsize-base.sty \
tex-bmpsize-dvipdfm.def \
tex-bmpsize-dvipdfmx.def \
tex-bmpsize-dvips.def \
tex-bmpsize-test.tex \
tex-bmpsize.sty \
tex-centernot.sty \
tex-chemarr.sty \
tex-classlist.sty \
tex-colonequals.sty \
tex-dvipscol.sty \
tex-engord.sty \
tex-enparen.sty \
tex-eolgrab.sty \
tex-fibnum.sty \
tex-flags.sty \
tex-holtxdoc.sty \
tex-hypbmsec.sty \
tex-hypcap.sty \
tex-hypgotoe.sty \
tex-hyphsubst.sty \
tex-ifdraft.sty \
tex-iflang.sty \
tex-pdfcolparallel.sty \
tex-pdfcolparcolumns.sty \
tex-pdfcrypt.sty \
tex-pdfrender.sty \
tex-protecteddef.sty \
tex-resizegather.sty \
tex-rotchiffre.sty \
tex-scrindex.sty \
tex-setouterhbox.sty \
tex-settobox.sty \
tex-stackrel.sty \
tex-stampinclude.sty \
tex-tabularht.sty \
tex-tabularkv.sty \
tex-telprint.sty \
tex-thepdfnumber.sty \
tex-twoopt.sty \
texlive-oberdiek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-atveryend.sty \
tex-bigintcalc.sty \
tex-etexcmds.sty \
tex-fontspec.sty \
tex-fp-basic.sty \
tex-fp-snap.sty \
tex-graphics.sty \
tex-hologo.sty \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-index.sty \
tex-infwarerr.sty \
tex-intcalc.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-parallel.sty \
tex-parcolumns.sty \
tex-pdfcol.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
tex-remreset.sty \
tex-unicode-math.sty \
tex-uniquecounter.sty \
tex-zref-base.sty \
texlive \
texlive-auxhook \
texlive-filesystem \
texlive-grfext \
texlive-grffile \
texlive-iftex \
texlive-infwarerr \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvoptions \
texlive-pdftexcmds \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
