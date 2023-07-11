SUMMARY = "Checkpoint/Restore In Userspace Tools"
DESCRIPTION = "Checkpoint/Restore In Userspace, or CRIU, is a software tool for Linux \
operating system. Using this tool, you can freeze a running application \
(or part of it) and checkpoint it to a hard drive as a collection of \
files. You can then use the files to restore and run the application from \
the point it was frozen at."
LICENSE = "GPL-2.0-only"

PV = "3.18"

RPM_NAME = "criu-3.18-1.2.aarch64.rpm"
RPM_HASH = "7f61aeedae672c30e795ea41179c19423fe35e336764f331e8870b2fb94339b447aff1bba9d3f6c34d689003a5695f9ac6539af311c3719f8aaf7f38d1b26aa7"

RPROVIDES:${PN} += "criu \
python3.11dist-crit \
python3dist-crit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libgnutls.so.30 \
libnet.so.9 \
libnftables.so.1 \
libnl-3.so.200 \
libprotobuf-c.so.1 \
python-abi \
python3-ipaddr \
python3-protobuf"

inherit rpm
