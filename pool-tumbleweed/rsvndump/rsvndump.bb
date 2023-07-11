SUMMARY = "Remote Subversion Repository Dumping Tool"
DESCRIPTION = "rsvndump is a command line tool that is able to dump a subversion \
repository that resides on a remote server. All data is dumped in the \
format that can be read/written by svnadmin, so the data produced by \
rsvndump can easily be imported into a new subversion repository."
LICENSE = "GPL-3.0-only"

PV = "0.6.1"

RPM_NAME = "rsvndump-0.6.1-1.4.aarch64.rpm"
RPM_HASH = "02224523e96ebb0b03fa4d8e2d2f4f8e793c9ae830e8fc2b8de2c3740746c1107b70b3d58611a732d7a3d151a635b304d5c35d7861a867e159e2096551cf3048"

RPROVIDES:${PN} += "rsvndump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-subr-1.so.0"

inherit rpm
