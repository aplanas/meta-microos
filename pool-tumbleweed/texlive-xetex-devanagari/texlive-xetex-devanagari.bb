SUMMARY = "XeTeX input map for Unicode Devanagari"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Devanagari (encoded according to the Harvard/Kyoto \
convention) to Unicode (range 0900-097F)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-2023.201.0.0.5svn34296-52.2.noarch.rpm"
RPM_HASH = "12ead668e1511fd90237d3145ef1f120a30037b1b9401c63ccbd50246948d2ff65a89a5a4a5cdd3bc3991dede152a8bdbdfa90e13b8157e9f4c0c6ee4abb0d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-devanagarinumerals.map \
tex-harvardkyoto.map \
tex-iast.map \
tex-velthuis-sanskrit.map \
tex-velthuis.map \
texlive-xetex-devanagari"

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
