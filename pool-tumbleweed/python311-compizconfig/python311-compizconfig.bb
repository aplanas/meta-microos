SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python311-compizconfig-0.8.18-2.21.aarch64.rpm"
RPM_HASH = "8806a8c63dc5bb942ada881693d02962853fb779ea34dd4370606f1259f848718a31a5cb39dfb52c27d1e24981c257c7cf3844ee9e794fb756e57bf1da437561"

RPROVIDES:${PN} += "python311-compizconfig \
python311-compizconfig(aarch-64)"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcompizconfig.so.0()(64bit) \
python(abi)"

inherit rpm
