SUMMARY = "Systemd service for zram"
DESCRIPTION = "A successor to compcache, zRam, has been already integrated in the Linux kernel \
for a while now. This means that no additional compilation nor tweaking is \
required to benefit from compressing memory on the fly and massively reduced \
swapping. \
 \
This package contains command line scripts zramswapon, zramswapoff to enable \
zRam devices as required, or at boot time via a systemd service. \
 \
Individual Compressed RAM Block Devices are created based on cores/threads \
available, the size of each block device is calculated on cores/threads divided \
by total ram installed. The final total is then added to system swap."
LICENSE = "GPL-2.0-only"

PV = "0.2.1"

RPM_NAME = "systemd-zram-service-0.2.1-4.2.noarch.rpm"
RPM_HASH = "36bf3620cad4d6f3ecfb1580d4ac28926854e30fbd7f449105ad7a95c6ac03252cd31c8aca91e558f42dc12ef78df25d2a19aa74729ff67f8fe52c0321ae08ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-zram-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
systemd"

inherit rpm
