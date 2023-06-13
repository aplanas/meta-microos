SUMMARY = "Severed fonts for texlive-tabvar"
DESCRIPTION = "The  separated fonts package for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn63921"

RPM_NAME = "texlive-tabvar-fonts-2023.201.1.8svn63921-54.1.noarch.rpm"
RPM_HASH = "efde19e9293034a7057967162e185987225b8219d0d6092a39a9f66dc06a9ed469c86f4e6f7b20c923bbff077755e0c2c07d84f70a37dd4ade006cbddb019c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(tabvar) \
texlive-tabvar-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
