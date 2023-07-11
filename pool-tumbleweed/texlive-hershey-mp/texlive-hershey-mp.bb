SUMMARY = "MetaPost support for the Hershey font file format"
DESCRIPTION = "This package provides MetaPost support for reading jhf vector \
font files, used by (mostly? only?) the so-called Hershey Fonts \
of the late 1960s. The package does not include the actual font \
files, which you can probably find in the software repository \
of your operating system."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-2023.201.2022_1.0svn64878-53.2.noarch.rpm"
RPM_HASH = "f7f4cf8f5164272cf2c534dcae313e6cf3eba4f96bf9b6d57909d2d13cbb82567c4c815f913a8d83f32953ef0cdb24041b5fd3d23394a848ef387fc17b882948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
