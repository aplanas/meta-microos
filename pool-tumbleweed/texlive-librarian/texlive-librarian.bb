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

PV = "2023.201.1.0svn19880"

RPM_NAME = "texlive-librarian-2023.201.1.0svn19880-54.1.noarch.rpm"
RPM_HASH = "671e044e6fc1b869ddee3dc66d29473797d6988bf4f1c01c55a23f4b4e26843e679f3b5b2066e4470c68f40927b126d44c383129d2dae53b851ff15e3539d047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(librarian.sty) \
tex(librarian.tex) \
tex(t-librarian.tex) \
texlive-librarian"
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
