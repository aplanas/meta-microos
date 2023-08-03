SUMMARY = "Process bibliographies (bib files) for LaTeX or other formats"
DESCRIPTION = "BibTeX allows the user to store his citation data in generic \
form, while printing citations in a document in the form \
specified by a BibTeX style, to be specified in the document \
itself (one often needs a LaTeX citation-style package, such as \
natbib, as well). BibTeX knows nothing about Unicode sorting \
algorithms or scripts, although it will pass on whatever bytes \
it reads. Its descendant bibtexu does support Unicode, via the \
ICU library. The older alternative bibtex8 supports 8-bit \
character sets. Another Unicode-aware alternative is the \
(independently developed) biber program, used with the BibLaTeX \
package to typeset its output."
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.99dsvn66186"

RPM_NAME = "texlive-bibtex-2023.209.0.0.99dsvn66186-54.1.noarch.rpm"
RPM_HASH = "6163f22333cf39939c425bac3211957830e324ed42de7257a6b64937e066ada213a2492e2cc331509003774a0d36736180cdc9854e831aa74bd63467d8539c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apalike.sty \
tex-apalike.tex \
texlive-bibtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
