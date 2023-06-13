SUMMARY = "LaTeX tools and documenting facilities"
DESCRIPTION = "This is a versatile bundle of packages and classes for \
consistent formatting of control sequences, package options, \
source code examples, and writing a package manual (including \
an index containing the explained control sequences, options, \
ldots). The bundle also provides several other small ideas of \
mine such as a mechansim for providing abbreviations etc. Not \
at least it provides a number of programming tools. The \
intention behind this bundle mainly is a selfish one: \
documenting my own packages. The bundle contains an index style \
file cnltx.ist that should be placed in a directory in a TDS \
makeindex directory."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.15svn55265"

RPM_NAME = "texlive-cnltx-2023.201.0.0.15svn55265-53.1.noarch.rpm"
RPM_HASH = "823d55f433cb3eb6cceda0915142a4b015422f94b63eed64397328b11826be3f477a8d3f64d5c18c4b037092806e46a3de9ea62c094d55fdde9ec66a1dd00e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cnltx-base.sty) \
tex(cnltx-doc.cls) \
tex(cnltx-example.sty) \
tex(cnltx-listings.sty) \
tex(cnltx-names.sty) \
tex(cnltx-tools.sty) \
tex(cnltx-translations.sty) \
tex(cnltx.bbx) \
tex(cnltx.cbx) \
tex(cnltx.sty) \
texlive-cnltx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accsupp.sty) \
tex(adjustbox.sty) \
tex(alphabetic.bbx) \
tex(alphabetic.cbx) \
tex(beramono.sty) \
tex(catchfile.sty) \
tex(etoolbox.sty) \
tex(fnpct.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(hyperref.sty) \
tex(idxcmds.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(imakeidx.sty) \
tex(libertine.sty) \
tex(listings.sty) \
tex(ltxcmds.sty) \
tex(marginnote.sty) \
tex(mdframed.sty) \
tex(microtype.sty) \
tex(multicol.sty) \
tex(pdftexcmds.sty) \
tex(pgfopts.sty) \
tex(ragged2e.sty) \
tex(scrartcl.cls) \
tex(scrlayer-scrpage.sty) \
tex(textcomp.sty) \
tex(translations.sty) \
tex(trimspaces.sty) \
tex(ulem.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
