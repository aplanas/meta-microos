SUMMARY = "Initialize form properties using big-endian encoding"
DESCRIPTION = "This package provides support for UTF-16BE Unicode character \
encoding (called a big-endian character string) for the text \
string type (PDF Reference, version 1.7, beginning on page \
158). Text strings are used in 'text annotations, bookmark \
names, article threads, document information, and so forth' (to \
partially quote page 158). The particular application is to set \
property values of form fields, at least those properties that \
take the text strings as its value. The package contains \
support for Basic Latin plus the ability to enter any unicode \
character using the notation \\uXXXX, where XXXX are four hex \
digits. The Package works for dvips/Distiller, pdfLaTeX, \
LuaLaTeX, and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn51305"

RPM_NAME = "texlive-forms16be-2023.209.1.3svn51305-53.1.noarch.rpm"
RPM_HASH = "b9bd6412414a237303485ff7573102b6719292f35a02bcefb753ef9bc5db22d0048fa4cdbbb797be43a6dba40925ac6348f340cc05c27bb1e765003fc7142f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forms16be.sty \
tex-uni4basic-latin.def \
texlive-forms16be"

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
