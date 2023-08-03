SUMMARY = "MetaPost support for the Hershey font file format"
DESCRIPTION = "This package provides MetaPost support for reading jhf vector \
font files, used by (mostly? only?) the so-called Hershey Fonts \
of the late 1960s. The package does not include the actual font \
files, which you can probably find in the software repository \
of your operating system."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-2023.209.2022_1.0svn64878-54.1.noarch.rpm"
RPM_HASH = "79ebc5d161fb263b9495b704938ba17a4d14836f8a09b5dd8878e3972ea39d08945b3be511bea89f6f12c6686dc87b318311c3c3bf34bb7d05388c896247299f"
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
