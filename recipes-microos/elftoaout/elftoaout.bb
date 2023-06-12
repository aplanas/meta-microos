SUMMARY = "Utility for converting ELF binaries to a.out"
DESCRIPTION = "The elftoaout utility converts a static ELF binary to a static a.out \
binary.  If you are using an ELF system on a SPARC, you will need to \
run elftoaout on the kernel image so that the SPARC PROM can boot the \
image."
LICENSE = "GPL-2.0+"

PV = "2.3"

RPM_NAME = "elftoaout-2.3-19.26.aarch64.rpm"
RPM_HASH = "087a12a1754f68b8867d56118bca5a8174da43cd4fcd656db718ea431f4648ec58f42c3265f601b2c5e1325e867d865c89383aa8bdbff83b7dab572b23173b59"

RPROVIDES:${PN} += "elftoaout \
elftoaout(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
