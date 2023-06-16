SUMMARY = "Typeset books following classical design and layout"
DESCRIPTION = "The octavo class is a modification of the standard LaTeX book \
class. Its purpose is to typeset books following classical \
design and layout principles, with the express intention of \
encouraging the making of beautiful books by anyone with access \
to a good printer and with an inclination towards venerable \
crafts, e.g., bookbinding. The octavo class differs from the \
book class by implementing many of the proposals and insights \
of respected experts, especially Jan Tschichold and Hugh \
Williamson. The documentation discusses methods to organise and \
print out any text into signatures, which can then be gathered, \
folded and sewn into a book."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-octavo-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "ee699c93b4368aa5a0bd5f4f34a30e636dffbae0dd76effff32d12ce2f1c9e46b3f3a027d3771cd6817f24dd2b85263402cff9d3a91077d83e389eaff5a11c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oct10.clo \
tex-oct11.clo \
tex-oct12.clo \
tex-octavo.cls \
texlive-octavo"

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
