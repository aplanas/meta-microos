SUMMARY = "A Program to get and set hard disk parameters"
DESCRIPTION = "A shell utility to access and tune the ioctl features of the Linux IDE \
driver and IDE drives."
LICENSE = "SUSE-Permissive"

PV = "9.65"

RPM_NAME = "hdparm-9.65-2.4.aarch64.rpm"
RPM_HASH = "380400ba907d4d568b8498297e1aa05e3c5df15e0833af5e9257b1d77f3d5f184a3c20ed5434c1f29d4400791013dfeed8dfacb1610bc56bdc308c3b822bca7b"

RPROVIDES:${PN} += "base-/sbin/hdparm \
hdparm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
