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

PV = "2023.201.0.0.99dsvn66186"

RPM_NAME = "texlive-bibtex-2023.201.0.0.99dsvn66186-53.1.noarch.rpm"
RPM_HASH = "74e5a3fefcababa509c754a316a2fc624c36c8ebbf1d3255fd36b713df7edd8150855070a833e4772ad135ff15ca92d29e9e77350309a4e9e3d03700fd6503ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apalike.sty) \
tex(apalike.tex) \
texlive-bibtex"

RDEPENDS:${PN} += "/bin/sh \
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
