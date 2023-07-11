SUMMARY = "Tool to load and stress a computer"
DESCRIPTION = "stress-ng can stress various subsystems of a computer. It can stress load CPU, \
cache, disk, memory, socket and pipe I/O, scheduling and much more. stress-ng \
is a re-write of the original stress tool by Amos Waterland but has many \
additional features such as specifying the number of bogo operations to run, \
execution metrics, a stress verification on memory and compute operations and \
considerably more stress mechanisms."
LICENSE = "GPL-2.0-only"

PV = "0.15.06"

RPM_NAME = "stress-ng-0.15.06-1.3.aarch64.rpm"
RPM_HASH = "fa089f74d16ce0332097d3f7e630aa2952395a07ef34c592faabc137451916bbfd7974f5611ebf25144e7128b196fc09f058546a9b4e5888ad2b16d30cd1a81c"

RPROVIDES:${PN} += "stress-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libsctp.so.1 \
libz.so.1"

inherit rpm
