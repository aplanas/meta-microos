SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python39-compizconfig-0.8.18-2.22.aarch64.rpm"
RPM_HASH = "ee06e3627942a306ae001c0f5f6f37535362d0c8ca297801b7bc6d73ebb7bd7846b4f6ca840aec1b37fa00d02e3c210be1dfd4cc043524da69495f70de7de972"

RPROVIDES:${PN} += "python39-compizconfig"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcompizconfig.so.0 \
python-abi"

inherit rpm
