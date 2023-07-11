SUMMARY = "Firmware flash utility for BTC DRW1008 DVD±RW recorder"
DESCRIPTION = "Btcflash is used to read update the Firmware for a BTC DRW1008 \
DVD±RW recorder. Be very careful when writing firmware as this \
program does not check for the correctness of the target device."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "btcflash-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "06faf4ac0ca30704aa8c7b0e8466d01181a10e05c64ed1a8f3e1d2e9109dd1c6d52759c583e98ed37d53393a5a5b36ce3fc7b88ac939e038fca2d5457202e924"

RPROVIDES:${PN} += "btcflash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdrdeflt.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0"

inherit rpm
