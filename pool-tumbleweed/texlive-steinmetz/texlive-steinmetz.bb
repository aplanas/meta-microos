SUMMARY = "Print Steinmetz notation"
DESCRIPTION = "The steinmetz package provides a command for typesetting \
complex numbers in the Steinmetz notation used in \
electrotechnics as: <modulus>;<argument or phase inside an \
angle symbol> The package makes use of pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-steinmetz-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "f00804885b6a3b8a4f6819b936ddb32850e0c5e45c3bb5c5953bd15385e0d688026882eefb7a77d8dafd15caa70e1e818abc83e82aa66df928a4139a3da22caf"
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
