SUMMARY = "Free and Open Scalable Electronic Font"
DESCRIPTION = "The efont-serif is a really free and open scalable electronic font. \
 \
The Omega Serif and URW Nimbus are also distributable. But their letter \
forms are quite similar to Adobe Times. The efont-serif does not copy \
the outlines or the letter forms of any copyrighted typefaces."
LICENSE = "GPL-2.0"

PV = "20010312"

RPM_NAME = "efont-serif-fonts-20010312-678.17.noarch.rpm"
RPM_HASH = "b2d337059aee2f633a1adc9986695b9b275b5c5fd95b202f79d31a7199d60d78dbeb8929ed83b2124565cf62831ccd793039847c5441a16d57c49a4beca9f757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(efont-serif-fonts) efont-serif-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
