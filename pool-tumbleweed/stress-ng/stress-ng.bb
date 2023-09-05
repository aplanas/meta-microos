SUMMARY = "Tool to load and stress a computer"
DESCRIPTION = "stress-ng can stress various subsystems of a computer. It can stress load CPU, \
cache, disk, memory, socket and pipe I/O, scheduling and much more. stress-ng \
is a re-write of the original stress tool by Amos Waterland but has many \
additional features such as specifying the number of bogo operations to run, \
execution metrics, a stress verification on memory and compute operations and \
considerably more stress mechanisms."
LICENSE = "GPL-2.0-only"

PV = "0.16.04"

RPM_NAME = "stress-ng-0.16.04-1.1.aarch64.rpm"
RPM_HASH = "c4039650fac66aa0487444feda1cc5db911e60d63e126b5fab7b6027bd4b21c841f1b171fd1e9a79d29efdfde433de033035a84af122a6b0bb10e3a7d9072b7f"

RPROVIDES:${PN} += "stress-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libsctp.so.1 \
libz.so.1"

inherit rpm
