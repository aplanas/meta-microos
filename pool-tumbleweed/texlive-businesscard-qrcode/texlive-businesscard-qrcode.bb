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

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-businesscard-qrcode-2023.201.1.2svn61719-52.1.noarch.rpm"
RPM_HASH = "51b5e3699f55a3369257085c03fff847d22b3e54fe828e04cdd51e5ce1a280ec3073d4075ec2d950356563359d211b82680c6f376e0015e9758ed5550cf808e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(businesscard-qrcode.cls) \
texlive-businesscard-qrcode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(DejaVuSans.sty) \
tex(calc.sty) \
tex(crop.sty) \
tex(etoolbox.sty) \
tex(extarticle.cls) \
tex(fontawesome.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(kvoptions.sty) \
tex(marvosym.sty) \
tex(qrcode.sty) \
tex(varwidth.sty) \
tex(wrapfig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
