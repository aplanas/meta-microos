SUMMARY = "UK format dates, with weekday"
DESCRIPTION = "The package is used to change the format of \\today's date, \
including the weekday, e.g., 'Saturday, 26 June 2008', the 'UK \
format', which is preferred in many parts of the world, as \
distinct from that which is used in \\maketitle of the article \
class, 'June 26, 2008', the 'US format'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn15878"

RPM_NAME = "texlive-eukdate-2023.201.1.04svn15878-52.1.noarch.rpm"
RPM_HASH = "edd53bf2c91c74a0e99d6c4fd4b8631372726c3f4f1eeab8bc77048bd29abf1ab711ec27734e9aed666d557495a3dfd72b19caceadcf4e0065a4955e97a8b6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eukdate.sty \
texlive-eukdate"

RDEPENDS:${PN} += "/bin/sh \
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
