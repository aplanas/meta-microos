SUMMARY = "Performance Co-Pilot (PCP) System and Monitoring Tools"
DESCRIPTION = "This PCP module contains additional system monitoring tools written \
in python."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-system-tools-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "15ec5d243040bc4495f3874791fe1a1ca94876d7c81cd973baa9267ef6af2e59a51fed4cb2df885fae5eea5abb0645064925da7466ad0feb3c980427fcfc1e08"

RPROVIDES:${PN} += "config-pcp-system-tools \
pcp-system-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libpcp-gui.so.2 \
libpcp.so.3 \
libtinfo.so.6 \
python3-pcp"

inherit rpm
