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

PV = "2023.201.2.4svn60593"

RPM_NAME = "texlive-xmpincl-2023.201.2.4svn60593-52.2.noarch.rpm"
RPM_HASH = "589cd27aa0a03724f09d5cf2bbc30b90d689c65cb2545b7dd457b152a8528686e8867a49b4e3b18b287a8360c3aac6b7b576d47bd6f823ae24f0b04b2713c6e3"
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
