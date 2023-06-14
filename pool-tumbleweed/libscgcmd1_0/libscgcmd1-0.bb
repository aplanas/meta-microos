SUMMARY = "SCSI command function library"
DESCRIPTION = "A library to create and parse SCSI commands (at the byte level)."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscgcmd1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "f24e109aa1b78ed160c6dffca2321bd1baea62fbc7efd58d4cbbcd32fa3ebd57a1bbc5f5aebe7c79cb0df9f03c1039ee3c1a2b3bb7c092da25af6d7275fa63da"

RPROVIDES:${PN} += "libscgcmd.so.1.0 \
libscgcmd1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
