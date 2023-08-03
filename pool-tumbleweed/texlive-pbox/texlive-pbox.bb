SUMMARY = "A variable-width \\parbox command"
DESCRIPTION = "Defines a command \\pbox{<max width>}{<text>} which adjusts its \
width to that of the enclosed text, up to the maximum width \
given. The package also defines some associated length \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn24807"

RPM_NAME = "texlive-pbox-2023.209.1.2svn24807-52.1.noarch.rpm"
RPM_HASH = "32c244110035e14e4fa2e13dd16a8688967ec923a7fb220acb04720b59a1034db8a9d649f0523014a6e1b133462a2e3e452a438a8140db6b29832e0520e61150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbox.sty \
texlive-pbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
