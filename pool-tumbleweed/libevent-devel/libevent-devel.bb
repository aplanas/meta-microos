SUMMARY = "Development files for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the development files for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-2.1.12-3.5.aarch64.rpm"
RPM_HASH = "e9913f3e439af7d76b0e06117f6cecf97c3f0c774e74835f0221ec631aa4c84d4611387e228be17987d737dff4ad4066c56da9ceb67421340755801ba64b4284"

RPROVIDES:${PN} += "libevent-/usr/include/event.h \
libevent-devel \
pkgconfig-libevent \
pkgconfig-libevent-core \
pkgconfig-libevent-extra \
pkgconfig-libevent-openssl \
pkgconfig-libevent-pthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
glibc-devel \
libevent-2-1-7 \
pkgconfig-libevent"

inherit rpm
