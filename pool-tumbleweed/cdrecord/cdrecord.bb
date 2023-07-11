SUMMARY = "A CD/DVD/BD recording program"
DESCRIPTION = "cdrecord is a program to record (slang: 'burn') data or audio Compact Discs \
on an Orange Book CD recorder, to write DVD media on a DVD recorder or to \
write BluRay media on a BluRay recorder."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdrecord-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "1627cbc4e4ee78a0c9b8a74de4038052f2f9b1798197cc0bdb332ca3535bfc152b46129216c6eba771e6c3e7c026430953a330a90e66d734d2f9df04e1a0874a"

RPROVIDES:${PN} += "cdrecord \
config-cdrecord"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libdeflt.so.1.0 \
libedc-ecc.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
