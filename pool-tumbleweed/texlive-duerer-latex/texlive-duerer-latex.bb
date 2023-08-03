SUMMARY = "LaTeX support for the Duerer fonts"
DESCRIPTION = "LaTeX support for Hoenig's Computer Duerer fonts, using their \
standard fontname names."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "911b96fcfa0b4c2238d0fd1fa8ad17dedced0a19a00efa35737d5bf1c2c90f5bcf73693e8ca918c18ebcf69fd09e7540ea5130056cdc80f36bbd5b9f49e5f7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duerer.sty \
tex-ot1cdin.fd \
tex-ot1cdr.fd \
tex-ot1cdss.fd \
tex-ot1cdtt.fd \
texlive-duerer-latex"

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
