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

PV = "2023.209.9.16svn63719"

RPM_NAME = "texlive-biblatex-apa-2023.209.9.16svn63719-54.1.noarch.rpm"
RPM_HASH = "397ccfdea6ebccf039d457b3c739c008503f6c58b82710b439fc105ce3989ff3c2396b4d1c3e9fa7951aca97181e07217aaf9385b2870bae6a95d00738b21c0a"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
