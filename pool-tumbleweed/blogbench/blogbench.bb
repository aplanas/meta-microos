SUMMARY = "Filesystem Benchmark"
DESCRIPTION = "Blogbench is a portable filesystem benchmark that tries to reproduce the load \
of a real-world busy file server. It stresses the filesystem with multiple \
threads performing random reads, writes, and rewrites in order to get a \
realistic idea of the scalability and the concurrency a system can handle."
LICENSE = "ISC"

PV = "1.2"

RPM_NAME = "blogbench-1.2-1.1.aarch64.rpm"
RPM_HASH = "9105e24548ca1c4012bf252986077dda605918b2cf9d901624406c9a6f0c7e254820bc1ebefe0db02892b83550c06162e28744b0fa5df8e39b715c72c9235c7a"

RPROVIDES:${PN} += "blogbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
