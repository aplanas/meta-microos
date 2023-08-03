SUMMARY = "'\\listfiles' entries from the command line"
DESCRIPTION = "The package provides a Unix shell script to display a list of \
LaTeX \\Provides...-command contexts on screen. Provision is \
made for controlling the searches that the package does. The \
package was developed on a Unix-like system, using (among other \
things) the gnu variant of the find command."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-adhocfilelist-2023.209.svn29349-55.1.noarch.rpm"
RPM_HASH = "faed5cc6a27b86cca9948eda3870fea15c91b69a98b01d3b972883c086409d4f31d488bda292252442de0023a9acd47768749c6b210290fe6ca3d0e0ab1c0dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-adhocfilelist-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
