SUMMARY = "Produce gaps that are underlined, dotted or dashed"
DESCRIPTION = "The package provides commands (\\underline, \\dotuline and \
\\dashuline) each of which underlines its argument with one of \
the styles the package is capable of. A phantom mode is \
provided, where the underline (of whatever form) can serve for \
a 'fill-in block' for student evaluation sheets."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0hsvn58150"

RPM_NAME = "texlive-dashundergaps-2023.209.2.0hsvn58150-55.1.noarch.rpm"
RPM_HASH = "707a39d1de17944360476dbcea5e782abf41e1a1ad9031ff5c9bd957196aea90ad7d0695937bf42f3af9dafdc8e0e4a12d16b5d2ef8ed9fbca43e39220ff06c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashundergaps.sty \
texlive-dashundergaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
