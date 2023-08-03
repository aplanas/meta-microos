SUMMARY = "Citation style following the rules of the APA"
DESCRIPTION = "Apacite provides a BibTeX style and a LaTeX package which are \
designed to match the requirements of the American \
Psychological Association's style for citations. The package \
follows the 6th edition of the APA manual, and is designed to \
work with the apa6 class. A test document is provided. The \
package is compatible with chapterbib and (to some extent) with \
hyperref (for limits of compatibility, see the documentation). \
The package also includes a means of generating an author index \
for a document."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.03svn54080"

RPM_NAME = "texlive-apacite-2023.209.6.03svn54080-55.1.noarch.rpm"
RPM_HASH = "01b3820bd9d1d1013d6cadd23b45cea6e20d31ecb830fa0f8256d8a49a1ca784ca7bc934a9b14624e6b129e073badb04d024f86dbb0634a998ec7007b99eed83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apacdoc.sty \
tex-apacite.sty \
texlive-apacite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-index.sty \
tex-multicol.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
