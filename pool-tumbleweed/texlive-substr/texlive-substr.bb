SUMMARY = "Deal with substrings in strings"
DESCRIPTION = "The package provides commands to deal with substrings of \
strings. Macros are provided to: determine if one string is a \
substring of another, return the parts of a string before or \
after a substring, and count the number of occurrences of a \
substring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn16117"

RPM_NAME = "texlive-substr-2023.209.1.2svn16117-58.1.noarch.rpm"
RPM_HASH = "313e94cfe1165e2ac190b48245e686bf30c0c56f4bc30624fe3763dd244002fd411188ba9b9054c816fc57e672487dc0ca8e46ae7aa708929e4ee8a977918856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-substr.sty \
texlive-substr"

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
