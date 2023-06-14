SUMMARY = "A tool to benchmark overall system performance"
DESCRIPTION = "This tool benchmarks overall system speed by mixing measurements of \
file system speed and execution speed under VM and CPU pressure."
LICENSE = "GPL-2.0-only"

PV = "7.0.1.13"

RPM_NAME = "reaim-7.0.1.13-1.12.aarch64.rpm"
RPM_HASH = "425ea95fcd23a964f72c2e22ec53a2d180b5e09fb81456279c4e171d59a1431ff4a16fcfad4a35b6b3de0b019b0b9cb64f8b6d94fe1bcadc75d818444bdb9415"

RPROVIDES:${PN} += "reaim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
