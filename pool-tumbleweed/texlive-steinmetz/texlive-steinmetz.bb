SUMMARY = "Print Steinmetz notation"
DESCRIPTION = "The steinmetz package provides a command for typesetting \
complex numbers in the Steinmetz notation used in \
electrotechnics as: <modulus>;<argument or phase inside an \
angle symbol> The package makes use of pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-steinmetz-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "7ec580e08cc34953be23524100678cbf0eb396ab3ba773dbb519ee43140d5347b38a815ed1cee4a21873a15b1c6d55aa5518a163cbfc9954ba252dcfeb66188a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-steinmetz.sty \
texlive-steinmetz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
