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

RPM_NAME = "systemd-zram-service-0.2.1-4.3.noarch.rpm"
RPM_HASH = "13f347fd6a050aef3e386d9c1481205495e85e0df2c360f2eb2e780334b985f2026323ba9bd04396ed8625c750504333eddf24e761a84f99ab2265f77d4306dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-zram-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
systemd"

inherit rpm
