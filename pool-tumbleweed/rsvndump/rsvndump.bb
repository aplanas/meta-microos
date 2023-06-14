SUMMARY = "Remote Subversion Repository Dumping Tool"
DESCRIPTION = "rsvndump is a command line tool that is able to dump a subversion \
repository that resides on a remote server. All data is dumped in the \
format that can be read/written by svnadmin, so the data produced by \
rsvndump can easily be imported into a new subversion repository."
LICENSE = "GPL-3.0-only"

PV = "0.6.1"

RPM_NAME = "rsvndump-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "1c454229aded31d326760e1e4a42894e05dd508290f4c17c3c7a68092724e20bdaca56abe9e0fc05abb5c7dd3d853f1fee972eb646ad09a96ff0349ea5adc32f"

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
