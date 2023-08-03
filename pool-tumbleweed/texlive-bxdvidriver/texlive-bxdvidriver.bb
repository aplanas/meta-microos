SUMMARY = "Enables specifying a driver option effective only in DVI output"
DESCRIPTION = "This single-function package enables authors to specify a \
global driver option (dvips, dvipdfmx, etc) which is applied \
only when the engine outputs a DVI file. It is useful to create \
special document- templates that can be compiled in both \
PDF-mode and DVI-mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-2023.209.0.0.2asvn43219-53.1.noarch.rpm"
RPM_HASH = "5a52cb2df692f3b1b80b71d6dfdd14858969c8db949a53f65e5a1fb9852e33528af8f2b142eafc96089565dfbda16df678581f49abef6990a4b92c520e428188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdvidriver.sty \
texlive-bxdvidriver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
