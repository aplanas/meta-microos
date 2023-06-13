SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d6-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "861b01236bf934f223688f71a3fbc7468192694b8754ea8d28f95f1d7147bfe9a9a64df57bfb6b6ef446fd4f8ba4d13ffd041ad023b3ef64e134acbb8adc50ba"

RPROVIDES:${PN} += "libXaw3d.so.6()(64bit) \
libXaw3d6 \
libXaw3d6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
