SUMMARY = "A set of OpenType fonts designed for coding environments"
DESCRIPTION = "Source Code is a set of monospaced OpenType fonts that have been designed to \
work well with coding environments. This family of fonts is a complementary \
design to the Source Sans family."
LICENSE = "OFL-1.1"

PV = "2.038"

RPM_NAME = "adobe-sourcecodepro-fonts-2.038-1.4.noarch.rpm"
RPM_HASH = "5384d8067d9eb52b935629cf4b5800e69691657fead27d835c8bcb6ce1326b72acc1b5a3da2ac4ac1794faf92a0867aea336e223622947ab5cca76cc9554f1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SourceCodePro-fonts \
adobe-sourcecodepro-fonts \
metainfo() \
metainfo(adobe-sourcecodepro-fonts.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
