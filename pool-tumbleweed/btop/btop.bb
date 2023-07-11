SUMMARY = "Usage and stats for processor, memory, disks, network and processes"
DESCRIPTION = "Resource monitor that shows usage and stats for processor, memory, disks, network and processes. C++ version and continuation of bashtop and bpytop."
LICENSE = "Apache-2.0"

PV = "1.2.13+git20230615.7e50b03"

RPM_NAME = "btop-1.2.13+git20230615.7e50b03-1.1.aarch64.rpm"
RPM_HASH = "0687ef4ecd7d4caa39a68bde0e30252e4b77a892fccd1de7fa12de87013b309cf6d6355898bc83670f491ce384c07ca365d34e33420d352c20c2a527eb527369"

RPROVIDES:${PN} += "btop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
