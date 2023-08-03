SUMMARY = "A lightweight and robust key-value parser"
DESCRIPTION = "The package provides lightweight and robust facilities for \
creating and managing keys. Its machinery isn't as extensive as \
that of, e.g., the ltxkeys package, but it is equally robust; \
ease of use and speed of processing are the design aims of the \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-2023.209.0.0.0.2svn23698-56.1.noarch.rpm"
RPM_HASH = "3a9644643dea0bdd78610c451727889cca035948c61a008a9ab6286b1c2359cc0c4e89f9773bd3b68060cd3fa9110f9d2181071eab33cfa57f52a02839470b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyval2e.sty \
texlive-keyval2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
