SUMMARY = "Tools using libxml"
DESCRIPTION = "This package contains xmllint, a very useful tool proving libxml's power."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-tools-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "f7fe842d1d77700e6a878ef9b763c5a3d2b31458b4ab1a9497dd5ef0a0e46497198ed1dd9fd3c58b0e6754cf26842737ab11e9a4a3cc9c9300852d9bd8d869eb"

RPROVIDES:${PN} += "libxml2 \
libxml2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libxml2.so.2"

inherit rpm
