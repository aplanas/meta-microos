SUMMARY = "A Class for Typesetting Brazilian legal texts"
DESCRIPTION = "This class implements rules to typeset Brazilian legal texts. \
Its purpose is to be an easy-to-use implementation for the \
end-user."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44939"

RPM_NAME = "texlive-br-lex-2023.201.svn44939-52.1.noarch.rpm"
RPM_HASH = "e5e83b3753aa3220d98caefbc8ced459421971c02c1442c61566952947ce6584f6932c2e43f6e30128346b194a647d41a2dbd5e71e781074319e72a95593b3d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(br-lex.cls) \
texlive-br-lex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(fontspec.sty) \
tex(ifxetex.sty) \
tex(inputenc.sty) \
tex(polyglossia.sty) \
tex(textcase.sty) \
tex(ulem.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
