SUMMARY = "Checkpoint/Restore In Userspace Tools"
DESCRIPTION = "Checkpoint/Restore In Userspace, or CRIU, is a software tool for Linux \
operating system. Using this tool, you can freeze a running application \
(or part of it) and checkpoint it to a hard drive as a collection of \
files. You can then use the files to restore and run the application from \
the point it was frozen at."
LICENSE = "GPL-2.0-only"

PV = "3.17.1"

RPM_NAME = "criu-3.17.1-3.5.aarch64.rpm"
RPM_HASH = "04b41a0a59c7f7def08ccd90b95197034b1651f180a172ce252657b393c2a4daa7fc44240b8f6c522c92f3813c9a593c5a71a08e700e42a4047f306d67e1a4a4"

RPROVIDES:${PN} += "criu \
python3.10dist-crit \
python3dist-crit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
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
