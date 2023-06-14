SUMMARY = "Tool to load and stress a computer"
DESCRIPTION = "stress-ng can stress various subsystems of a computer. It can stress load CPU, \
cache, disk, memory, socket and pipe I/O, scheduling and much more. stress-ng \
is a re-write of the original stress tool by Amos Waterland but has many \
additional features such as specifying the number of bogo operations to run, \
execution metrics, a stress verification on memory and compute operations and \
considerably more stress mechanisms."
LICENSE = "GPL-2.0-only"

PV = "0.15.06"

RPM_NAME = "stress-ng-0.15.06-1.2.aarch64.rpm"
RPM_HASH = "543dc2bd2ae73baefcb52b788d11577c51556494c42bb6c1c960f7751ff1dc0baa05af0dbcd39b2f5e2831f2a014d753dbd939ce825420dec241c54e82b6c54e"

RPROVIDES:${PN} += "stress-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libsctp.so.1 \
libz.so.1"

inherit rpm
