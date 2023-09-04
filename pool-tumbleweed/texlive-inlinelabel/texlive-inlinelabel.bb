SUMMARY = "Assign equation numbers to inline equations"
DESCRIPTION = "This package can assign equation numbers to inline equations. \
When Japanese is supported, you can switch to circled equation \
numbers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-2023.209.1.2.1svn63853-54.1.noarch.rpm"
RPM_HASH = "0da8cceb56445d2957ffb259b715e2ec47022c5e81cfb774df93511fabf0403dc0299903ee0fbc2cf2972d1f951005c02b64284b1e12d4696dcd0d531cdc72f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinelabel.sty \
texlive-inlinelabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
