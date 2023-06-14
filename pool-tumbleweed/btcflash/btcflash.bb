SUMMARY = "Firmware flash utility for BTC DRW1008 DVD±RW recorder"
DESCRIPTION = "Btcflash is used to read update the Firmware for a BTC DRW1008 \
DVD±RW recorder. Be very careful when writing firmware as this \
program does not check for the correctness of the target device."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "btcflash-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "9d36253f06a62cd36cde5d802b70dd7f06334c1033023818377eb774f87fdb6fe6f4af3e2d4746d8fd6241ddd4020f6f1ea36d73ff48001cffeadd866fa33bd4"

RPROVIDES:${PN} += "btcflash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdrdeflt.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0"

inherit rpm
