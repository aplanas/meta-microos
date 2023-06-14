SUMMARY = "BibLaTeX citation and reference style for APA"
DESCRIPTION = "This is a fairly complete BibLaTeX style (citations and \
references) for APA (American Psychological Association) \
publications. It implements and automates most of the \
guidelines in the APA 7th edition style guide for citations and \
references. An example document is also given which typesets \
every citation and reference example in the APA 7th edition \
style guide. This version of the package requires use of \
csquotes [?]4.3, BibLaTeX [?]3.4, and the biber backend for \
BibLaTeX [?]2.5."
LICENSE = "LPPL-1.0"

PV = "2023.201.9.16svn63719"

RPM_NAME = "texlive-biblatex-apa-2023.201.9.16svn63719-53.1.noarch.rpm"
RPM_HASH = "e800cb269b0f08abaf6ea38036c41bde8785e9fa98694cfc35a6fe98e1391afd3f60f7538adf743df4322dd7b1f5aa16599de5be27ac92fd9c4c8c1a633af86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-apa.lbx \
tex-apa.bbx \
tex-apa.cbx \
tex-austrian-apa.lbx \
tex-brazilian-apa.lbx \
tex-british-apa.lbx \
tex-catalan-apa.lbx \
tex-danish-apa.lbx \
tex-dutch-apa.lbx \
tex-english-apa.lbx \
tex-finnish-apa.lbx \
tex-french-apa.lbx \
tex-galician-apa.lbx \
tex-german-apa.lbx \
tex-greek-apa.lbx \
tex-italian-apa.lbx \
tex-naustrian-apa.lbx \
tex-ngerman-apa.lbx \
tex-norsk-apa.lbx \
tex-norwegian-apa.lbx \
tex-nswissgerman-apa.lbx \
tex-nynorsk-apa.lbx \
tex-portuguese-apa.lbx \
tex-russian-apa.lbx \
tex-slovene-apa.lbx \
tex-spanish-apa.lbx \
tex-swedish-apa.lbx \
tex-swissgerman-apa.lbx \
tex-turkish-apa.lbx \
texlive-biblatex-apa"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
