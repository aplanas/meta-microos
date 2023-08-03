SUMMARY = "Write letters, facsimiles, and memos"
DESCRIPTION = "Integrates the letter class with fancyhdr and geometry to \
automatically make letterhead stationery. Useful for writing \
letters, fax, and memos. You can set up an address book using \
'wrapper' macros. You put all the information for a person into \
a wrapper and then put the wrapper in a document. The class \
handles letterheads automatically. You place the object for the \
letterhead (picture, information, etc.) in a box and all sizing \
is set automatically."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.9.4svn15878"

RPM_NAME = "texlive-newlfm-2023.209.9.4svn15878-55.1.noarch.rpm"
RPM_HASH = "31c78444b4cafe27b62cce804cbb3173db0f478d5bc74cc150d94de4d20229aa31fc639424bfcede4327346b84882822713f6134573b9f5071f9ca2986750d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addrset.sty \
tex-newlfm.cls \
tex-setdim.sty \
texlive-newlfm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-calc.sty \
tex-envlab.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-letter.cls \
tex-rotating.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
