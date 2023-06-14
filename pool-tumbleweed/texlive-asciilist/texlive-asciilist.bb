SUMMARY = "Environments AsciiList and AsciiDocList for prototyping nested lists in LaTeX"
DESCRIPTION = "The asciilist provides the environments AsciiList and \
AsciiDocList, which enable quickly typesetting nested lists in \
LaTeX without having to type individual item macros or \
opening/closing list environments. The package provides \
auxiliary functionality for loading such lists from files and \
provides macros for configuring the use of the list \
environments and the appearance of the typeset results."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2bsvn49060"

RPM_NAME = "texlive-asciilist-2023.201.2.2bsvn49060-53.1.noarch.rpm"
RPM_HASH = "787a7a8372af2bf54c7602b00db4cd71ee92f3c6595cbc255f875dd67f71340146a98ae44e462abdf994e83c62f930ce1e395bb28fa0aac9657ecc77826a36c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asciilist.sty \
texlive-asciilist"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
