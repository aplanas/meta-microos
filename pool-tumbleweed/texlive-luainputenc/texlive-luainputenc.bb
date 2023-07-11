SUMMARY = "Replacing inputenc for use in LuaTeX"
DESCRIPTION = "LuaTeX operates by default in UTF-8 input; thus LaTeX documents \
that need 8-bit character-sets need special treatment. (In \
fact, LaTeX documents using UTF-8 with 'traditional' -- \
256-glyph -- fonts also need support from this package.) The \
package, therefore, replaces the LaTeX standard inputenc for \
use under LuaTeX. With a current LuaTeX,the package has the \
same behaviour with LuaTeX as inputenc has under pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.0.0.973svn20491"

RPM_NAME = "texlive-luainputenc-2023.208.0.0.973svn20491-53.1.noarch.rpm"
RPM_HASH = "e767698403645da905134b864b4fe64a7ce8e885876242a2ee5d78e5b82d8e5181d123ab58dddc1befc6641a155f487839ee31a5d6f23ea81acaf2e937437989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luainputenc.sty \
tex-lutf8.def \
tex-lutf8x.def \
texlive-luainputenc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
