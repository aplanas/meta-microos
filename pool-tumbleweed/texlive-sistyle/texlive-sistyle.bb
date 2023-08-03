SUMMARY = "Package to typeset SI units, numbers and angles"
DESCRIPTION = "This package typesets SI units, numbers and angles according to \
the ISO requirements. Care is taken with font setup and \
requirements, and language customisation is available. Note \
that this package is (in principle) superseded by siunitx; \
sistyle has maintenance-only support, now."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn59682"

RPM_NAME = "texlive-sistyle-2023.209.2.3asvn59682-58.1.noarch.rpm"
RPM_HASH = "7510cd23b94feb79db4db4dff96d0dd697f816d414dab6606d543bd3441a97ef84d9d81bf2edf2bab7c32ff17754c17737b6e24922b18c80510193d549dd9ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sistyle.sty \
texlive-sistyle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
