SUMMARY = "Usage and stats for processor, memory, disks, network and processes"
DESCRIPTION = "Resource monitor that shows usage and stats for processor, memory, disks, network and processes. C++ version and continuation of bashtop and bpytop."
LICENSE = "Apache-2.0"

PV = "1.2.13+git20221215.c4ee41e"

RPM_NAME = "btop-1.2.13+git20221215.c4ee41e-1.3.aarch64.rpm"
RPM_HASH = "72abdc47da5d7836a2522092189c63322b19f02a59ddbc144088c50b156fb0b8e7f7b55c80182d715d9d34d8303045747b0fa82302010e4ad91bad1a86c8fc96"

RPROVIDES:${PN} += "application() \
application(btop.desktop) \
btop \
btop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
