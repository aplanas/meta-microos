SUMMARY = "Automatic equation references"
DESCRIPTION = "The package arranges that equation numbers are applied only to \
those equations that are referenced. This operation is similar \
to the showonlyrefs option of the package mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.11svn36084"

RPM_NAME = "texlive-autonum-2023.201.0.0.3.11svn36084-53.1.noarch.rpm"
RPM_HASH = "8ee4469b1e24b99c0211f8c7f5bc6b267975d40ae5165af0b44cae5cedd8b5f388d8830d4ad7e3b9b4395223525cbf24e0d2c57ab963744a586a0db421b1f911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autonum.sty \
texlive-autonum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etextools.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
