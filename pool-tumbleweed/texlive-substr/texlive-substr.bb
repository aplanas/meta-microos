SUMMARY = "Deal with substrings in strings"
DESCRIPTION = "The package provides commands to deal with substrings of \
strings. Macros are provided to: determine if one string is a \
substring of another, return the parts of a string before or \
after a substring, and count the number of occurrences of a \
substring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn16117"

RPM_NAME = "texlive-substr-2023.201.1.2svn16117-57.1.noarch.rpm"
RPM_HASH = "0f2a3b4c46a3ad181effcd40c94b1caa9794f562439396528ab444c44277a1ed7fcdd9f70511c9455ff50c0787e4685d41c5ecdac618dd320e89e8ec092df32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(substr.sty) \
texlive-substr"
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
