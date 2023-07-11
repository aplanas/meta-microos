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

PV = "2023.208.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-2023.208.2.0.0svn60027-53.1.noarch.rpm"
RPM_HASH = "b8b95611e0249ff67087d81b235048fe4a5fe8e30f770e8be3c38dcbe8705fe357f8eae96fa9e7f9ea11a5690afd87f405917d20028dc54ab095514899e0e37c"
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
