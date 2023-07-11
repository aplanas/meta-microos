SUMMARY = "Make eqnarray behave like align"
DESCRIPTION = "The package makes eqnarray environment behave like align from \
amsmath'. It is intended for quick-fixing documents that use \
eqnarray. In cases where it fails, manual conversion to align \
is required, but these cases should be seldom."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-2023.201.1.0asvn43278-53.2.noarch.rpm"
RPM_HASH = "64fa0fbb0180a6d0add93c243c0f05643f5025c53c46a27bd689352c0dbb18bd19932aa8c717944a29593b7145cbc489c5c0a1c07e80d11c391144d6514f6ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnalign.sty \
texlive-eqnalign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
