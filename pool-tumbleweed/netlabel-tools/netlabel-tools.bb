SUMMARY = "Control utility for explicit labeled networking for Linux"
DESCRIPTION = "Explicit labeled networking for Linux \
 \
The NetLabel control utility, netlabelctl, is a command line program designed \
to allow system administrators to configure the NetLabel system in the kernel. \
The utility is based around different 'modules' which correspond to the \
different types of NetLabel commands supported by the kernel."
LICENSE = "GPL-2.0-only"

PV = "0.21"

RPM_NAME = "netlabel-tools-0.21-3.7.aarch64.rpm"
RPM_HASH = "44cca4b04feb03010dd8bafe9a1c09ee2a7e314096e565af9f651070da8c5de4342aa3b85bf35593e5ea60836d96af17a61734bc78d5dedb3527e28327cfb11b"

RPROVIDES:${PN} += "config-netlabel-tools \
netlabel-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
