SUMMARY = "Using the free ASAP Symbol font with LaTeX and Plain TeX"
DESCRIPTION = "The package provides macros (usable with LaTeX or Plain TeX) \
for using the freely available ASAP Symbol font, which is also \
included. The font is distributed in OpenType format, and makes \
extensive use of OpenType features. Therefore, at this time, \
only XeTeX and LuaTeX are supported. An error message is issued \
if an OTF-capable engine is not detected."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn40201"

RPM_NAME = "texlive-asapsym-2023.201.1.0svn40201-53.1.noarch.rpm"
RPM_HASH = "c222987ab04bbfdff29cdccab50adc532b935809be341453f541e4709b2555b4891d83eaa57d66d4e525eec045a19c28ee2e4830060ef8652dd797d913fdb2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(asapsym-generic.tex) \
tex(asapsym.code.tex) \
tex(asapsym.sty) \
texlive-asapsym"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
texlive \
texlive-asapsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
