SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "Core files of Scheme48 without development environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-vm-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "70525e504c9b31107c085f4f3110a71f473a765b956b887e617478db94700b854d372510af75a5d7116650f5732e0ab8f1c98f0800e966ffd151dde60382c3a3"

RPROVIDES:${PN} += "scheme48-vm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
