SUMMARY = "XeTeX input map for Unicode Devanagari"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Devanagari (encoded according to the Harvard/Kyoto \
convention) to Unicode (range 0900-097F)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-2023.209.0.0.5svn34296-53.2.noarch.rpm"
RPM_HASH = "6e9700dd4c559d9d1d7354dcc09fb45f118ac94b9619c440d149385e21af3f1e2e3dffe0e75417a4b55263a78e6a6e0ee140d9db84a4e1fddb25d479ff912d63"
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
