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

PV = "2023.209.1.24svn57097"

RPM_NAME = "texlive-stringstrings-2023.209.1.24svn57097-58.1.noarch.rpm"
RPM_HASH = "79934899758cc40a0ae605f2f7251a3430c163aa5db5c7b49365925263d644139a0d214aca2c7cabc454863020cfe62cc08563d6d8e13aecf7ef93882f386024"
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
