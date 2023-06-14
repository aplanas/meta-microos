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

PV = "2023.201.9.4svn15878"

RPM_NAME = "texlive-newlfm-2023.201.9.4svn15878-54.1.noarch.rpm"
RPM_HASH = "4be3a89fe1ad6a421f235cc8a87751bdf974326f78770e2a30300966378bd9b96e814fa313eca7db6bda51195c2500950c6890856e43e0f0551aebd45d57d579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addrset.sty \
tex-newlfm.cls \
tex-setdim.sty \
texlive-newlfm"

RDEPENDS:${PN} += "/bin/sh \
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
