SUMMARY = "Replacing inputenc for use in LuaTeX"
DESCRIPTION = "LuaTeX operates by default in UTF-8 input; thus LaTeX documents \
that need 8-bit character-sets need special treatment. (In \
fact, LaTeX documents using UTF-8 with 'traditional' -- \
256-glyph -- fonts also need support from this package.) The \
package, therefore, replaces the LaTeX standard inputenc for \
use under LuaTeX. With a current LuaTeX,the package has the \
same behaviour with LuaTeX as inputenc has under pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.973svn20491"

RPM_NAME = "texlive-luainputenc-2023.201.0.0.973svn20491-52.1.noarch.rpm"
RPM_HASH = "12dd0c97c86c1268afc440f3d8610afe221a220b3e5a92ff159f98ae65ae0dfd6293304aa60537559d1928dc008a62bdd655d0f53f61cd523722672dbbefb07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luainputenc.sty \
tex-lutf8.def \
tex-lutf8x.def \
texlive-luainputenc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
