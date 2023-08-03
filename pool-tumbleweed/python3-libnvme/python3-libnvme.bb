SUMMARY = "Python binding for libnvme"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "python3-libnvme-1.4-3.1.aarch64.rpm"
RPM_HASH = "0e5efe2a536918483dfd906e39ca324d4a8084ca694b79d4ddbb99abe03a5124b7b294bb5b3599128430e1570b50b561541bf7c9c46c5863dfa850b1b776c6a7"

RPROVIDES:${PN} += "python3-libnvme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnvme.so.1 \
python-abi"

inherit rpm
