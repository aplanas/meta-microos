SUMMARY = "Osmocom SIMtrace host utility"
DESCRIPTION = "Osmocom SIMtrace 2 is a software and hardware system for passively \
tracing SIM-ME communication between the SIM card and the mobile phone, \
and remote SIM operation. \
 \
This package contains SIMtrace 2 host utility."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "simtrace2-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "e0eb86ae1cd94d4b7fdb3674a53ebbd4194a59e9745a3a3c9873f81ce8a11afe63696edb8183659c2e9cb9455d1b3af7b4381c0e6b97de1069adbfb5479c0fec"

RPROVIDES:${PN} += "simtrace2 \
simtrace2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-simtrace2.so.1()(64bit) \
libosmocore.so.20()(64bit) \
libosmosim.so.2()(64bit) \
libosmousb.so.0()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
