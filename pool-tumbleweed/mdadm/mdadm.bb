SUMMARY = "Utility for configuring 'MD' software RAID devices"
DESCRIPTION = "mdadm is a program that can be used to control Linux md devices."
LICENSE = "GPL-2.0-only"

PV = "4.2"

RPM_NAME = "mdadm-4.2-8.2.aarch64.rpm"
RPM_HASH = "ab2ff8d1b31cd721e4702a0e69d94dfeb8aaaa8c2cfbf3b55b925b5bc5bc87dc0333444cd08ae9541bab94b14f3a851b74ad91423fe9b0f740998962f3b5a473"

RPROVIDES:${PN} += "mdadm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
