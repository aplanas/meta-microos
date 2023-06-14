SUMMARY = "BibTeX styles to implement an address database"
DESCRIPTION = "The bundle provides a collection of BibTeX style files to turn \
an address database stored in the .bib format into files \
suitable for printing as address books or included into letter \
classes like akletter or scrletter2. The data may be sorted \
either by name or birthday and output provides files in various \
formats for address books or time planners."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn46817"

RPM_NAME = "texlive-adrconv-2023.201.1.4svn46817-54.1.noarch.rpm"
RPM_HASH = "46015e9376cb9dcc80fd9b6d1b049cbb18ff956c2256777a0f4f8f57bc42618e05ef03cf3a14e33bfff76051338ab40a3f4754c63de0e0363a59b8256adf8d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adrdir.cfg \
tex-adrplaner.cfg \
tex-adrsmall.cfg \
texlive-adrconv"

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
