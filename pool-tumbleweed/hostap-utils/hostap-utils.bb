SUMMARY = "Tools for Prism2 cards"
DESCRIPTION = "This package contains various tools for configuring Prism2 cards driven \
by the HostAP kernel module. In particular, it contains a utility to \
query and flash firmware of Prism2 adapters."
LICENSE = "GPL-2.0+"

PV = "0.4.7"

RPM_NAME = "hostap-utils-0.4.7-204.26.aarch64.rpm"
RPM_HASH = "b58afa8b3fd721da4b781f5e95dde4d1e88f5ed58bfa071b723e1644d42e34cfeb8c21af0f4c8b43cfbbaa726201019eaf4787f8a0de605e4e3c26a484e44422"

RPROVIDES:${PN} += "hostap-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
