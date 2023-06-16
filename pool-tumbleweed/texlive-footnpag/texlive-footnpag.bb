SUMMARY = "Per-page numbering of footnotes"
DESCRIPTION = "Allows footnotes on individual pages to be numbered from 1, \
rather than being numbered sequentially through the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-footnpag-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "99730b854c4ba3a6b34a09495c443a0e206c7eabd83953176e48223fb7f04216bc301bdbd4b11f18cc147e49639ed75a9f37bf79cd864c204751c25fd0e74cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnpag.sty \
texlive-footnpag"

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
