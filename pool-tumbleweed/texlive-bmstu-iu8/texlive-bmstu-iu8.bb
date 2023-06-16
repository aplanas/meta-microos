SUMMARY = "A class for IU8 reports"
DESCRIPTION = "This package consists of a class file and style files for \
writing reports at the IU8 department of IU faculty of BMSTU \
(Bauman Moscow State Technical University). The class defines \
all headings, structure elements and other things in respect of \
Russian standard GOST 7.32-2017. But there are correctives to \
be compatible with our local IU8 department requirements."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-bmstu-iu8-2023.201.1.2svn61937-52.1.noarch.rpm"
RPM_HASH = "17c54cc9d8c7ec76d2a0271953d1c40536764646d84eed15435b68ab62db34fa3314ec7c30b0e8e7984f62ab46e7169d0b24e6c77f72070147cf8e82b27e99fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-01-IU8-base.sty \
tex-02-IU8-construction.sty \
tex-03-IU8-numbering.sty \
tex-04-IU8-section-numbering.sty \
tex-05-IU8-figures.sty \
tex-06-IU8-tables.sty \
tex-07-IU8-footnotes.sty \
tex-08-IU8-formulas.sty \
tex-09-IU8-cites.sty \
tex-10-IU8-titlepage.sty \
tex-11-IU8-performers.sty \
tex-12-IU8-abstract.sty \
tex-13-IU8-contents.sty \
tex-14-IU8-terms-and-definitions.sty \
tex-15-IU8-list-of-abbreviations.sty \
tex-16-IU8-references.sty \
tex-17-IU8-appendices.sty \
tex-18-IU8-extra.sty \
tex-19-IU8-counters.sty \
tex-20-IU8-listing.sty \
tex-21-IU8-math.sty \
tex-22-IU8-algorithms.sty \
tex-BMSTU-IU8.cls \
texlive-bmstu-iu8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-article.cls \
tex-babel.sty \
tex-bookmark.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-glossaries-extra.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-hyphsubst.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-nowidow.sty \
tex-scrextend.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-tabto.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-totcount.sty \
tex-ulem.sty \
tex-xassoccnt.sty \
tex-xcolor.sty \
tex-xltabular.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
