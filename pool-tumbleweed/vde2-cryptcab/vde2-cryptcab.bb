SUMMARY = "VDE ecryption module"
DESCRIPTION = "This package contains CryptCab, which can be used \
to send encrypted data over an UDP link."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "vde2-cryptcab-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "733ad16ac2d08db5a494371619746a1f30df3eac7ebbcb21ed6084bf39c29a116f5a3c7305a4a4574ac6395295b0c03d981bd355d8434a636c02c569c4263a06"

RPROVIDES:${PN} += "vde2-cryptcab \
vde2-cryptcab(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libvdeplug.so.3()(64bit)"

inherit rpm
