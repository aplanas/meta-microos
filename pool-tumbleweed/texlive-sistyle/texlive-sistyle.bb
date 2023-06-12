SUMMARY = "Package to typeset SI units, numbers and angles"
DESCRIPTION = "This package typesets SI units, numbers and angles according to \
the ISO requirements. Care is taken with font setup and \
requirements, and language customisation is available. Note \
that this package is (in principle) superseded by siunitx; \
sistyle has maintenance-only support, now."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn59682"

RPM_NAME = "texlive-sistyle-2023.201.2.3asvn59682-57.1.noarch.rpm"
RPM_HASH = "e55b6a6def6b0c576d9ad91f4bc30e60eb7f7c9b083e094756c349d81296d40332f2f61f3f9ce1dc15c200bb4e32817bbe45e61bef0b6c3d663121c79907e3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sistyle.sty) \
texlive-sistyle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amstext.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
