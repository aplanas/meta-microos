SUMMARY = "A CD/DVD/BD recording program"
DESCRIPTION = "cdrecord is a program to record (slang: 'burn') data or audio Compact Discs \
on an Orange Book CD recorder, to write DVD media on a DVD recorder or to \
write BluRay media on a BluRay recorder."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdrecord-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "cf459a62fdd37682ccfc5a399223db4b50405ea2d96981a41fc3b1c0640ba28d8fe26d857b39fd6c03021fb42c01917ad43bf3f66abcda2d1c7ddf4e265ee006"

RPROVIDES:${PN} += "cdrecord \
cdrecord(aarch-64) \
config(cdrecord)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcdrdeflt.so.1.0()(64bit) \
libcdrdeflt.so.1.0(SCHILY_1.0)(64bit) \
libdeflt.so.1.0()(64bit) \
libdeflt.so.1.0(SCHILY_1.0)(64bit) \
libedc_ecc.so.1.0()(64bit) \
libedc_ecc.so.1.0(SCHILY_1.0)(64bit) \
librscg.so.1.0()(64bit) \
librscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0()(64bit) \
libscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0(SCHILY_1.1)(64bit) \
libscgcmd.so.1.0()(64bit) \
libscgcmd.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
permissions"

inherit rpm
