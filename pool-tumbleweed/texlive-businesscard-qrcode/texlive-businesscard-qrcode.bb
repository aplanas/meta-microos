SUMMARY = "Business cards with QR-Code"
DESCRIPTION = "What happens when you give your visiting card to someone? \
Either they manually type the text into their computer or \
mobile phone, or it will end up in a box and be forgotten. \
Nowadays data is required electronically, not on paper. Here is \
the solution: A visiting card with QR-Code that contains a full \
vcard so that it can be scanned with an app on the mobile phone \
and thereby automatically imported into the electronic \
contacts. This also works well when you are offline and \
bluetooth transfer fails. So here is the highly configurable \
business card or visiting card with full vcard as QR-Code, \
ready to send to online printers. You can specify the exact \
size of the paper and the content within the paper, inluding \
generation of crop marks. The package depends on the following \
other LaTeX packages: calc, crop, DejaVuSans, etoolbox, \
fontawesome, fontenc, geometry, kvoptions, marvosym, qrcode, \
varwidth, and wrapfig. The package needs XeLaTeX for working \
properly."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-businesscard-qrcode-2023.209.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "f27787083b23360d04ff99d6a8b64ee0acb6dac5c660a6029cd8aedc44c1db9fc73428ad0c27a9f13c3a0e50d2fec7a83931d0cb48379655fa790f44df1a059a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-businesscard-qrcode.cls \
texlive-businesscard-qrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-DejaVuSans.sty \
tex-calc.sty \
tex-crop.sty \
tex-etoolbox.sty \
tex-extarticle.cls \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-kvoptions.sty \
tex-marvosym.sty \
tex-qrcode.sty \
tex-varwidth.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
