SUMMARY = "TCTI interface loading library"
DESCRIPTION = "This is a helper library that simplifies loading other tcti libraries. It is \
recommended over custom tcti loading code in applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tctildr0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "75372d2973cf172e95d02c6ce273f6cb135256d26a6dfe767310e4615f6d6dc9f53144238406fce0cf04ebc80df8d7874f675cab304be88992eccc09225ccad2"

RPROVIDES:${PN} += "libtss2-tctildr.so.0()(64bit) \
libtss2-tctildr0 \
libtss2-tctildr0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
