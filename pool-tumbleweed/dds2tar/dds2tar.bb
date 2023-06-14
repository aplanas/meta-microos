SUMMARY = "DDS2 Tape Streamer Utilities"
DESCRIPTION = "A tool for quick extraction of individual files from a DDS2 streamer. \
dds2tar can control data compression for HP DAT streamers."
LICENSE = "GPL-2.0+"

PV = "2.5.2"

RPM_NAME = "dds2tar-2.5.2-1332.21.aarch64.rpm"
RPM_HASH = "dd1b8bc1f4daffcec5a14a995c7d5b827906ace7e08d0cbf0cf08ac455ab1c176fe50d5eab92d23c1bb1325035d1769bfc1df7c847466c72c926af51abc00a53"

RPROVIDES:${PN} += "dds2tar"

RDEPENDS:${PN} += "/bin/csh \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
