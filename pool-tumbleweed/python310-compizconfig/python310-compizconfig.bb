SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python310-compizconfig-0.8.18-2.22.aarch64.rpm"
RPM_HASH = "0e8653cf952f3714663951c1a4fe47fa6b37aea27f7ba9f9a7a33a20b97bd00f51532a170e3374ba7c126ddcb66a5d54281235981a9605753c176a8d3d5efee2"

RPROVIDES:${PN} += "python310-compizconfig"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcompizconfig.so.0 \
python-abi"

inherit rpm
