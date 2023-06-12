SUMMARY = "A lightweight and robust key-value parser"
DESCRIPTION = "The package provides lightweight and robust facilities for \
creating and managing keys. Its machinery isn't as extensive as \
that of, e.g., the ltxkeys package, but it is equally robust; \
ease of use and speed of processing are the design aims of the \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-2023.201.0.0.0.2svn23698-55.1.noarch.rpm"
RPM_HASH = "05126ae20b6eed6d1045c7e3b1cb43fec825c5be6785f4ac38a576275567828348e4b0c71d7a99ed970942e6f7096fcd4bd3079d67f25441bf6a2ce0c8d3e61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(keyval2e.sty) \
texlive-keyval2e"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(catoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
