SUMMARY = "A Program That Lists Information about Files Opened by Processes"
DESCRIPTION = "Lsof lists information about files opened by processes. An open file \
may be a regular file, a directory, a block special file, a character \
special file, an executing text reference, a library, a stream, or a \
network file (Internet socket, NFS file, or UNIX domain socket.)  A \
specific  file or all the files in a file system may be selected by \
path."
LICENSE = "Zlib"

PV = "4.98.0"

RPM_NAME = "lsof-4.98.0-2.1.aarch64.rpm"
RPM_HASH = "aea0d3d9b3216c272e6e36c3d35d7928a13898072d88709bf6c7058650d3f41d3dc529c80a57620712125efbf19e86fb1b8abe3fed20b2d2c7aefb21068031b6"

RPROVIDES:${PN} += "lsof \
lsof(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
