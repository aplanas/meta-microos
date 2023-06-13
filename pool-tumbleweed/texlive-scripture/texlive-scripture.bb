SUMMARY = "A LaTeX style for typesetting Bible quotations"
DESCRIPTION = "The scripture package provides a set of macros for typesetting \
quotations from the Bible. It provides many features commonly \
seen in Bibles such as dropped text for chapter numbers, \
superscripts for verse numbers, indented lines for poetry \
sections, narrow sections and hanging paragraphs. A reference \
for the quotation can optionally be added."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn65493"

RPM_NAME = "texlive-scripture-2023.201.1.3svn65493-53.1.noarch.rpm"
RPM_HASH = "a439256d1c1f5532175404ea7c09887cafc40ba6137539a51b5cec8878d02f997c9fd9965ca3307188ef957f0705c93abe8ade320a3f8ad6e90ee2e4c4071b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scripture.sty) \
texlive-scripture"

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
