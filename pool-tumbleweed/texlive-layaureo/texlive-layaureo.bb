SUMMARY = "A package to improve the A4 page layout"
DESCRIPTION = "This package produces a wide page layout for documents that use \
A4 paper size. Moreover, LayAureo provides both a simple hook \
for leaving an empty space which is required if pages are \
bundled by a press binding (use option binding=length), and an \
option called big which it forces typearea to become maximum."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-2023.201.0.0.2svn19087-54.1.noarch.rpm"
RPM_HASH = "79d817a4e19302ad514b294352b497b38238adcb2f03073266ec4fa3c7ec7d27fd6a6094a13092b10efcf461e19a63f8ca5660a09ef3c08acc3d8aed6906b9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(layaureo.sty) \
texlive-layaureo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(geometry.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
