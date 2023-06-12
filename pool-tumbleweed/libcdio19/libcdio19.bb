SUMMARY = "CD-ROM Access Library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. Applications can use them as an abstraction to OS- and \
device-dependent properties of a CD-ROM or of the specific details of \
various CD image formats. \
 \
This subpackage contains the C API library from cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libcdio19-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "d7143607316171a3508f35845064719716627f254aed2754898fd2186969858d3a34c8409eacb25d020986e54bb6f58ddc1dd6d15a897432db842643ddd34a06"

RPROVIDES:${PN} += "libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio19 \
libcdio19(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
