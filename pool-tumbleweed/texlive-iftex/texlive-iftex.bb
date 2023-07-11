SUMMARY = "Am I running under pdfTeX, XeTeX or LuaTeX?"
DESCRIPTION = "The package, which works both for Plain TeX and for LaTeX, \
defines the \\ifPDFTeX, \\ifXeTeX, and \\ifLuaTeX conditionals for \
testing which engine is being used for typesetting. The package \
also provides the \\RequirePDFTeX, \\RequireXeTeX, and \
\\RequireLuaTeX commands which throw an error if pdfTeX, XeTeX \
or LuaTeX (respectively) is not the engine in use."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0fsvn61910"

RPM_NAME = "texlive-iftex-2023.208.1.0fsvn61910-53.1.noarch.rpm"
RPM_HASH = "4602fdcf362c72b9e36051867b974e7620bbf3019844987b78b60eaedf2738909b19e6a47a6c698a4c308e272d12543f327482b6584cd783bfd5144896570b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifetex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
texlive-iftex"

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
