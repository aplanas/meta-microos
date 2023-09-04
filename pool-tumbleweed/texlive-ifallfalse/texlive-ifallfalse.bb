SUMMARY = "Compare a string against a set of other strings"
DESCRIPTION = "This package allows you to check whether a string is contained \
within another set of strings, and perform an action if it is \
not. This is done by using the allfalse environment and passing \
in a string and an action to be performed if the string is not \
contained in the set. Then, passing in a string to the \\orcheck \
macro inside the respective allfalse environment adds that to \
the set of strings. This package does not work with the LuaTeX \
engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-2023.209.2.0.0svn60027-54.1.noarch.rpm"
RPM_HASH = "60abb6463d4c0060ed95037bd25c2b52244884f9c649520a6789efaff9ddbb73eb5e0781e599b9f6ef28079be40449b0ae08bc5a7af0c5dddb02ade34f8d725f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifallfalse.sty \
texlive-ifallfalse"

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
