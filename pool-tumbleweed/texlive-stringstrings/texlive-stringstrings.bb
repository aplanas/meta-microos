SUMMARY = "String manipulation for cosmetic and programming application"
DESCRIPTION = "The package provides a large and sundry set of macros for the \
manipulation of strings. The macros are developed not merely \
for cosmetic application (such as changing the case of letters \
and string substitution), but also for programming applications \
such as character look-ahead, argument parsing, conditional \
tests on various string conditions, etc. The macros were \
designed all to be expandable (note that things such as \
\\uppercase and \\lowercase are not expandable), so that the \
macros may be strung together sequentially and nested (after a \
fashion) to achieve rather complex manipulations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24svn57097"

RPM_NAME = "texlive-stringstrings-2023.201.1.24svn57097-57.1.noarch.rpm"
RPM_HASH = "3ca30f91e1bc710949863e60dcf76895ba7a74d3070d8422b2e1cebea8795830f4ec8bbc57378a83de227c7655dd83d3e34e690c371543c261cb724b2be89d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stringstrings.sty \
texlive-stringstrings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
