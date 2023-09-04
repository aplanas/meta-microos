SUMMARY = "MetaPost support for the Hershey font file format"
DESCRIPTION = "This package provides MetaPost support for reading jhf vector \
font files, used by (mostly? only?) the so-called Hershey Fonts \
of the late 1960s. The package does not include the actual font \
files, which you can probably find in the software repository \
of your operating system."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-2023.209.2022_1.0svn64878-54.2.noarch.rpm"
RPM_HASH = "64e6bfe2c7bf693b65def7bec55a1f8febd140c37246e332dcc5d29397021d30f0ad5297177e01a45aaed541025fd539e854859512ebdfe77491a67f16e17f43"
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
