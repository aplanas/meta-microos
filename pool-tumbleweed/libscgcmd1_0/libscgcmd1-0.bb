SUMMARY = "SCSI command function library"
DESCRIPTION = "A library to create and parse SCSI commands (at the byte level)."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscgcmd1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "c726bc66fa0985d91247d81d9a8d03956ccaf91bd398b9f7ad7f8f0acf8d647645b07be4ba72c8d1a5f85712c0e52f9831dd460d8f449a0447e5fd643030caab"

RPROVIDES:${PN} += "libscgcmd.so.1.0 \
libscgcmd1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
