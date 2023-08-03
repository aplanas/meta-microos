SUMMARY = "Copy DVI files, flattening VFs"
DESCRIPTION = "DVICOPY is a utility program that allows one to take a DVI file \
that references composite fonts (VF) and convert it into a DVI \
file that does not contain such references. It also serves as a \
basis for writing DVI drivers (much like DVItype)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn66186"

RPM_NAME = "texlive-dvicopy-2023.209.1.5svn66186-54.1.noarch.rpm"
RPM_HASH = "f263b4e76b94dab1c3414c884f3b0b98571c67f48c3cf123150d7a5bcbce62e8366162b4d92fa75567e1d7391ddeda6c2f59f4bcf5a5754f6bf6327a73193c7f"
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
