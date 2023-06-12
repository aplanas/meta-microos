SUMMARY = "BibLaTeX citation and reference style for APA 6th Edition"
DESCRIPTION = "This is a fairly complete BibLaTeX style (citations and \
references) for APA (American Psychological Association) 6th \
Edition conformant publications. It implements and automates \
most of the guidelines in the APA 6th edition style guide for \
citations and references. An example document is also given \
which typesets every citation and reference example in the APA \
6th edition style guide. This is a legacy style for 6th Edition \
documents. Please use the BibLaTeX-apa style package for the \
latest APA edition conformance."
LICENSE = "LPPL-1.0"

PV = "2023.201.8.5svn56209"

RPM_NAME = "texlive-biblatex-apa6-2023.201.8.5svn56209-53.1.noarch.rpm"
RPM_HASH = "47942308c6a3ad9d12e97150f6d0de5d2bdfbc1744513731b56eea9dc37bdee2807c54b7f2efffbb80d62db7d0ae59f4bab179d9f04fa9d3c8592c31a2de5c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(american-apa6.lbx) \
tex(apa6.bbx) \
tex(apa6.cbx) \
tex(austrian-apa6.lbx) \
tex(brazilian-apa6.lbx) \
tex(british-apa6.lbx) \
tex(danish-apa6.lbx) \
tex(dutch-apa6.lbx) \
tex(english-apa6.lbx) \
tex(french-apa6.lbx) \
tex(galician-apa6.lbx) \
tex(german-apa6.lbx) \
tex(greek-apa6.lbx) \
tex(italian-apa6.lbx) \
tex(naustrian-apa6.lbx) \
tex(ngerman-apa6.lbx) \
tex(norsk-apa6.lbx) \
tex(norwegian-apa6.lbx) \
tex(nswissgerman-apa6.lbx) \
tex(nynorsk-apa6.lbx) \
tex(portuguese-apa6.lbx) \
tex(russian-apa6.lbx) \
tex(slovene-apa6.lbx) \
tex(spanish-apa6.lbx) \
tex(swedish-apa6.lbx) \
tex(swissgerman-apa6.lbx) \
texlive-biblatex-apa6"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(standard.bbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
