SUMMARY = "File system directory change monitoring tool"
DESCRIPTION = "GNU Direvent monitors events in the file system directories. For each event \
that occurs in a set of pre-configured directories, the program calls an \
external program associated with it, supplying it with the information about \
the event and the location within the file system where it occured."
LICENSE = "GPL-3.0-or-later"

PV = "5.3"

RPM_NAME = "direvent-5.3-1.6.aarch64.rpm"
RPM_HASH = "295ed9380b17145d2eafaa4e1a143920dde9708417d1e269fdb466537f65c7f0b8af55bd1d259429757f49d483f97a84fbb5d24e06e6d6be886c4d47e509d5b1"

RPROVIDES:${PN} += "direvent \
direvent(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
