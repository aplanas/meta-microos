SUMMARY = "Severed fonts for texlive-gfssolomos"
DESCRIPTION = "The  separated fonts package for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-fonts-2023.201.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "cb90edbe490561056299b2bbb85d1229bab18a3fe5b82927f0d9dda66a0532f41fd0281c6b521a5e0116c3ff394f208809c7d885cd0815ece6a40d0fa83cd90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-gfssolomos-fonts) \
font(:lang=el) \
font(gfssolomos) \
texlive-gfssolomos-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
