SUMMARY = "Python binding for libnvme"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "python3-libnvme-1.4-1.3.aarch64.rpm"
RPM_HASH = "75d670eab24e277cba8292ce161c25aff8163755eb2094b0bccf167be51f1c7282fe3fac802b5076f6817135ccd3ebf397872a465f2ac4e179f59a64bbafe32c"

RPROVIDES:${PN} += "python3-libnvme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnvme.so.1 \
python-abi"

inherit rpm
