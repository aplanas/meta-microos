SUMMARY = "A LaTeX style for typesetting Bible quotations"
DESCRIPTION = "The scripture package provides a set of macros for typesetting \
quotations from the Bible. It provides many features commonly \
seen in Bibles such as dropped text for chapter numbers, \
superscripts for verse numbers, indented lines for poetry \
sections, narrow sections and hanging paragraphs. A reference \
for the quotation can optionally be added."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn65493"

RPM_NAME = "texlive-scripture-2023.209.1.3svn65493-54.1.noarch.rpm"
RPM_HASH = "fcbb40bace7b085b9ac41a0cba7fbd2fe9f3ab3264dd729d7cc737f1ba01e968c512df48e36e0ff1a7b581e5e10a21a9482bf3e0f2cb5039c13dca073be86df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scripture.sty \
texlive-scripture"

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
