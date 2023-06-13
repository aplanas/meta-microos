SUMMARY = "Filesystem Benchmark"
DESCRIPTION = "Blogbench is a portable filesystem benchmark that tries to reproduce the load \
of a real-world busy file server. It stresses the filesystem with multiple \
threads performing random reads, writes, and rewrites in order to get a \
realistic idea of the scalability and the concurrency a system can handle."
LICENSE = "ISC"

PV = "1.1"

RPM_NAME = "blogbench-1.1-4.8.aarch64.rpm"
RPM_HASH = "33748da99fdaba0beb4da9847521e6c0540a15dd159d73c0b85a6be65923f29887941929b6f339f3501937bdeb58b46c17a69e03ba3e3d6a96f4b734c0f73862"

RPROVIDES:${PN} += "blogbench \
blogbench(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
