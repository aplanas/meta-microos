SUMMARY = "Am I running under pdfTeX, XeTeX or LuaTeX?"
DESCRIPTION = "The package, which works both for Plain TeX and for LaTeX, \
defines the \\ifPDFTeX, \\ifXeTeX, and \\ifLuaTeX conditionals for \
testing which engine is being used for typesetting. The package \
also provides the \\RequirePDFTeX, \\RequireXeTeX, and \
\\RequireLuaTeX commands which throw an error if pdfTeX, XeTeX \
or LuaTeX (respectively) is not the engine in use."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn61910"

RPM_NAME = "texlive-iftex-2023.209.1.0fsvn61910-54.1.noarch.rpm"
RPM_HASH = "59de2dd2bf4d6dbf420d6579f51da2036845178ac9b7b7a98504df5513ceef3f42366c96275c0d9145ecd332ca332d9aa5dca68f6c91e43a71672bbd415618b1"
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
