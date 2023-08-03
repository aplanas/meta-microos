SUMMARY = "Create correct hyperlinks for DOI numbers"
DESCRIPTION = "You can hyperlink DOI numbers to doi.org. However, some \
publishers have elected to use nasty characters in their DOI \
numbering scheme ('<', '>', '_' and ';' have all been spotted). \
This will either upset (La)TeX, or your PDF reader. This \
package contains a single user-level command \\doi{}, which \
takes a DOI number, and creates a correct hyperlink to the \
target of the DOI."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48634"

RPM_NAME = "texlive-doi-2023.209.svn48634-53.1.noarch.rpm"
RPM_HASH = "9e974e6c5d990e40c6c88d4b7ff84dfbd9d63224c7c332cd20106be2228ec4735b49fceeda82efdcbd1334e8e25adb359b5dc9b0cacf670726940c0b50c852e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doi.sty \
texlive-doi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
