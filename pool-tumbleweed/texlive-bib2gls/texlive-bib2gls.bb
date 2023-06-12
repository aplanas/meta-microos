SUMMARY = "Command line application to convert .bib files to glossaries-extra.sty resource files"
DESCRIPTION = "This Java command line application may be used to extract \
glossary information stored in a .bib file and convert it into \
glossary entry definition commands. This application should be \
used with glossaries-extra.sty's 'record' package option. It \
performs two functions in one: selects entries according to \
records found in the .aux file (similar to bibtex), \
hierarchically sorts entries and collates location lists \
(similar to makeindex or xindy). The glossary entries can then \
be managed in a system such as JabRef, and only the entries \
that are actually required will be defined, reducing the \
resources required by TeX. The supplementary application \
convertgls2bib can be used to convert existing .tex files \
containing definitions (\\newglossaryentry etc.) to the .bib \
format required by bib2gls."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.2svn65104"

RPM_NAME = "texlive-bib2gls-2023.201.3.2svn65104-53.1.noarch.rpm"
RPM_HASH = "85c708f1d16c2315c9d80ee4c67ce6e8bdff4ec8d4898893fe195d8a5a11ae8a2a39ab9388b228725f4f1d4a92b86a344cedcf2c3438ab6744f0a82b274c229a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bib2gls.jar) \
tex(convertgls2bib.jar) \
tex(texparserlib.jar) \
texlive-bib2gls"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-bib2gls-bin \
texlive-filesystem \
texlive-glossaries-extra \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
