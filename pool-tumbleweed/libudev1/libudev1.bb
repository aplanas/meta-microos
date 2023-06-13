SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "libudev1-253.4-2.1.aarch64.rpm"
RPM_HASH = "b23fa0fd86897d7e7fd8ac94fc6cd729978a08d81258ecb805bf690125eecf6315d84de415b3ce831a3d61c9649c1d754924744ac30e8da45fa9a4c6f8a03c93"

RPROVIDES:${PN} += "libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_189)(64bit) \
libudev.so.1(LIBUDEV_196)(64bit) \
libudev.so.1(LIBUDEV_199)(64bit) \
libudev.so.1(LIBUDEV_215)(64bit) \
libudev.so.1(LIBUDEV_247)(64bit) \
libudev1 \
libudev1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit)"

inherit rpm
