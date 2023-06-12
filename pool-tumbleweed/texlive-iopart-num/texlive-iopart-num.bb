SUMMARY = "Numeric citation style for IOP journals"
DESCRIPTION = "A BibTeX style providing numeric citation in Harvard-like \
format. Intended for use with Institute of Physics (IOP) \
journals, including Journal of Physics."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-iopart-num-2023.201.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "50fa97b5f1f827ccffdafafcfbbb5473d802a160348f2a931f167b9bde89c43573a56298eafff2f78b99d4d6cecb2cdca482dead4faa9abf7be2fb657cf7ff8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num"
RDEPENDS:${PN} += "/bin/sh \
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
