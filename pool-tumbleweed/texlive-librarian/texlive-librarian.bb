SUMMARY = "Tools to create bibliographies in TeX"
DESCRIPTION = "The package extracts information in bib files, makes it \
available in the current document, and sorts lists of entries \
according to that information and the user's specifications. \
Citation and bibliography styles can then be written directly \
in TeX, without any use of BibTeX. Creating references thus \
depends entirely on the user's skill in TeX. The package works \
with all formats that use plain TeX's basic syntactic sugar; \
the distribution includes a third-party file for ConTeXt and a \
style file for LaTeX. As an example of use, an Author (Year) \
style is given in a separate file and explained in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19880"

RPM_NAME = "texlive-librarian-2023.209.1.0svn19880-55.1.noarch.rpm"
RPM_HASH = "b12b5dd54d2c700628a635bd9d08d90c9e5795cc300382822680827578847bf07e4199999ecf47b1596c33eb8883c894c60bbb47b9aebdafa948f45070d8c768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-librarian.sty \
tex-librarian.tex \
tex-t-librarian.tex \
texlive-librarian"

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
