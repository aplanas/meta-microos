SUMMARY = "Cisco router Emulator"
DESCRIPTION = "Cisco Router Emulator supported by GNS3 Community \
 \
Dynamips emulates Cisco 7200/3600/3725/3745/2691 Routers on a traditional PC. \
You can use dynamips to create labs. It uses IOS Images (which are not part \
of this package). Of course, this emulator cannot replace a real router. It is \
simply a complementary tool to real labs for administrators of Cisco networks \
or people wanting to pass their CCNA/CCNP/CCIE exams."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.23"

RPM_NAME = "dynamips-0.2.23-2.1.aarch64.rpm"
RPM_HASH = "db9e6f0a0355737bc4da958fe9ebe90ae52ac4d68dcb990bd9a6c9f53a7178b083727852e5b2c3f55eaac9410d55b3095d2297242dab099625e304a1bcc6a7f6"

RPROVIDES:${PN} += "dynamips dynamips(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libpcap.so.1()(64bit)"

inherit rpm
