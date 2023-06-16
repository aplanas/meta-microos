SUMMARY = "Performance Co-Pilot (PCP) System and Monitoring Tools"
DESCRIPTION = "This PCP module contains additional system monitoring tools written \
in python."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-system-tools-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "1097f6fc37bf28c00c02e419e9a8d86e89377b17d445c9c3107afcb42128d4bc8e596deddb3be7976e414ac9b66d266d4c65fd70849b3fcbcf62aef03a53e129"

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
