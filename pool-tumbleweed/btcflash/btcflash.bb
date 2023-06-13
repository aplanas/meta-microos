SUMMARY = "Firmware flash utility for BTC DRW1008 DVD±RW recorder"
DESCRIPTION = "Btcflash is used to read update the Firmware for a BTC DRW1008 \
DVD±RW recorder. Be very careful when writing firmware as this \
program does not check for the correctness of the target device."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "btcflash-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "9d36253f06a62cd36cde5d802b70dd7f06334c1033023818377eb774f87fdb6fe6f4af3e2d4746d8fd6241ddd4020f6f1ea36d73ff48001cffeadd866fa33bd4"

RPROVIDES:${PN} += "btcflash \
btcflash(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdrdeflt.so.1.0()(64bit) \
libcdrdeflt.so.1.0(SCHILY_1.0)(64bit) \
librscg.so.1.0()(64bit) \
librscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0()(64bit) \
libscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0(SCHILY_1.1)(64bit) \
libscgcmd.so.1.0()(64bit) \
libscgcmd.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit)"

inherit rpm
