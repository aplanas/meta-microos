SUMMARY = "Vector/OTF versions of the Darwin console font"
DESCRIPTION = "The 8x16 system console font from the MacOS kernel, Darwin (XNU)."
LICENSE = "APSL-2.0"

PV = "20211008"

RPM_NAME = "consoleet-darwin-fonts-20211008-1.6.noarch.rpm"
RPM_HASH = "74df6993888e227808ede307963f70e01dec58d0d0323b6113c0d4c28880b878b89b58a7647e1086c2a022146b57625b0f08c06466e64315c8c21bc8118075c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-darwin-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
