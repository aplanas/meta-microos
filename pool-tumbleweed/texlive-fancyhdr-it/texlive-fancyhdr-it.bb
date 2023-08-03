SUMMARY = "Italian translation of fancyhdr documentation"
DESCRIPTION = "The translation is of documentation provided with the fancyhdr \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21912"

RPM_NAME = "texlive-fancyhdr-it-2023.209.svn21912-53.1.noarch.rpm"
RPM_HASH = "02caf3218ab22d65ad9f5f90af13cdf1815c53c0d041f91be34f0c97eab384be7a96aefa8907df654a26dda32389cca9edffdf3ebc482bc5ccf0d6313bc29d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-it"

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
