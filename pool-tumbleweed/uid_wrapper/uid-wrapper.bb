SUMMARY = "A wrapper for privilege seperation"
DESCRIPTION = "Some projects like a file server need privilege separation to be able to switch \
to the connnection user and do file operations. uid_wrapper convincingly lies \
to the application, letting it believe it is operating as root and even \
switching betwen UIDs and GIDs as needed. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libuid_wrapper.so \
UID_WRAPPER=1 \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "uid_wrapper-1.3.0-3.3.aarch64.rpm"
RPM_HASH = "3c315cae959e95182e87b03a76b33674eec35e7f96f2ca18dec0c6bb426062b1f1ce33f5734f31744f3f48480830dad7ac3d9a1b99ce29c4f386a8e6bafc23cf"

RPROVIDES:${PN} += "cmake-uid-wrapper \
libuid-wrapper.so.0 \
pkgconfig-uid-wrapper \
uid-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
