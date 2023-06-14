SUMMARY = "A CD/DVD/BD recording program"
DESCRIPTION = "cdrecord is a program to record (slang: 'burn') data or audio Compact Discs \
on an Orange Book CD recorder, to write DVD media on a DVD recorder or to \
write BluRay media on a BluRay recorder."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdrecord-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "cf459a62fdd37682ccfc5a399223db4b50405ea2d96981a41fc3b1c0640ba28d8fe26d857b39fd6c03021fb42c01917ad43bf3f66abcda2d1c7ddf4e265ee006"

RPROVIDES:${PN} += "cdrecord \
config-cdrecord"

RDEPENDS:${PN} += "/bin/sh \
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
