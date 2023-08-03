SUMMARY = "Include eXtensible Metadata Platform data in pdfLaTeX"
DESCRIPTION = "The XMP (eXtensible Metadata platform) is a framework to add \
metadata to digital material to enhance the workflow in \
publication. The essence is that the metadata is stored in an \
XML file, and this XML stream is then embedded in the file to \
which it applies. How you create this XML file is up to you, \
but the author started investigating this because he wanted to \
embed licensing information in the files he created. The \
license the author chose is one of the Creative Commons \
licenses, and their web-site offers this information in a valid \
XML-file, suitable for direct inclusion."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4svn60593"

RPM_NAME = "texlive-xmpincl-2023.209.2.4svn60593-53.1.noarch.rpm"
RPM_HASH = "f533e1a21ead5969f51594f745ecc438a6695eba0152157c4629140fec5c589891cfaecf1a7eb5ad4d6132eb04b861b723d39ef83b715a8c1006a2bd6c4ca971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmpincl.sty \
texlive-xmpincl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
