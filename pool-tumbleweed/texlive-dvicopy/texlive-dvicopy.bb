SUMMARY = "Copy DVI files, flattening VFs"
DESCRIPTION = "DVICOPY is a utility program that allows one to take a DVI file \
that references composite fonts (VF) and convert it into a DVI \
file that does not contain such references. It also serves as a \
basis for writing DVI drivers (much like DVItype)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn66186"

RPM_NAME = "texlive-dvicopy-2023.201.1.5svn66186-53.2.noarch.rpm"
RPM_HASH = "8bae7f70d2ad3af955d234508b7e76d7fa477a0bff8b46207eb88ebf847f5552ca080de53fe81e9c71150ea0239c51df76e0c1ffdc9104acd8ff3e85f00b676f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvicopy.1 \
texlive-dvicopy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvicopy-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
