SUMMARY = "Javanese Font"
DESCRIPTION = "Font supporting unicode codepoints from U+A980 to U+A9DF."
LICENSE = "OFL-1.1"

PV = "2.01"

RPM_NAME = "tuladha-jejeg-fonts-2.01-3.17.noarch.rpm"
RPM_HASH = "c7f28cd64cb463f493bc6a88dd33e95867c77aee9b3d173a2c25f71ac43566d5f110180c64f3c664d85f6883eb954b5bb9ee941a314627139d1e6ddb8f0be5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuladha-jejeg-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
