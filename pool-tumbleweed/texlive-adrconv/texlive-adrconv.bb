SUMMARY = "BibTeX styles to implement an address database"
DESCRIPTION = "The bundle provides a collection of BibTeX style files to turn \
an address database stored in the .bib format into files \
suitable for printing as address books or included into letter \
classes like akletter or scrletter2. The data may be sorted \
either by name or birthday and output provides files in various \
formats for address books or time planners."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn46817"

RPM_NAME = "texlive-adrconv-2023.209.1.4svn46817-55.1.noarch.rpm"
RPM_HASH = "e64f840be53737d16e15d209ddb5d3dfea561f2223569ef26c14f2b74d2db467961468baec468cbb0e75471348e9a9d154cf1220a173e3e0cdbc7b19ee997843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adrdir.cfg \
tex-adrplaner.cfg \
tex-adrsmall.cfg \
texlive-adrconv"

RDEPENDS:${PN} += "/usr/bin/sh \
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
