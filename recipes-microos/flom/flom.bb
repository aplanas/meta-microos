SUMMARY = "Distributed Lock Manager"
DESCRIPTION = "FLoM is a free open source distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. Supports networking, abstract \
resources, offers a library, encryption and peer authentication."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "flom-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "85eaee59c579596857cb13f01c5a340955a430f83304251b81f5959ac585406781f10b6f0a8c2a24c537fae23a116affdadd8d5e059d03acf58a273682669cc4"

RPROVIDES:${PN} += "flom flom(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libflom.so.0()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
