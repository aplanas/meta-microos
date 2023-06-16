SUMMARY = "Noto Georgian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-georgian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "cb44a12a6bbe7b57fcddd33805f07dacd03fcb1a8c82bb46f1198fdb2ee3b1453ea4f0420d47cdd69cf354e28a69e9b84eb6d2c40a5636e61626666bac65d336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-georgian \
noto-serif-georgian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
