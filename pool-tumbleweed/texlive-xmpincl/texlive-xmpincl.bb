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

RPM_NAME = "texlive-xmpincl-2023.209.2.4svn60593-53.2.noarch.rpm"
RPM_HASH = "b64c1dcaaf17840908e2a40e7e0b839f920209f1101b1a4e2806f3c1da3f06713e39ae5d1d0ada60c754fa37eeb70d1aa426615ee3f81a50f080110028c43fb4"
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
