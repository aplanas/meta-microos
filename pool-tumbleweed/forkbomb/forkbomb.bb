SUMMARY = "Controlled fork() bomber for testing heavy system load"
DESCRIPTION = "Classic Unix fork() bomber. Includes CPU hanger, memory allocator, memory \
toucher and zombie dance team. You can test how will your computer behave under \
heavy CPU, process, memory load. Linux 2.4 and FreeBSD 5.4 don't survive \
classic forkbomb. Forkbomb is also useful as realloc() benchmark."
LICENSE = "SUSE-Public-Domain"

PV = "1.4"

RPM_NAME = "forkbomb-1.4-3.21.aarch64.rpm"
RPM_HASH = "58ad2f1bbebadd2299c662a9802925a6415ca2b80e73e0a6b3eea500dce7deff8e966db13005af2bf3900f584b0236f61f6f7000c8fa9c0f500cb1b96f3556d4"

RPROVIDES:${PN} += "forkbomb \
forkbomb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
