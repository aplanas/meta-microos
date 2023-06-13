SUMMARY = "XeTeX input map for Unicode Devanagari"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Devanagari (encoded according to the Harvard/Kyoto \
convention) to Unicode (range 0900-097F)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-2023.201.0.0.5svn34296-52.1.noarch.rpm"
RPM_HASH = "967b9fecccc880239de9f880b627d6c230b96c65101d2e56aeb7f88351056c484861fef1ff0020dd389a0a9ae86b7279774d863ee32c1ee2641540c766ea6056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(devanagarinumerals.map) \
tex(harvardkyoto.map) \
tex(iast.map) \
tex(velthuis-sanskrit.map) \
tex(velthuis.map) \
texlive-xetex-devanagari"

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
