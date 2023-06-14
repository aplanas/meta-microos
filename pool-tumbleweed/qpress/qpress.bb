SUMMARY = "File archiver designed for speed"
DESCRIPTION = "qpress is a portable file archiver using QuickLZ and designed to utilize \
fast storage systems to their max. It's often faster than file copy \
because the destination is smaller than the source. A few features: \
 \
* multiple cores, reaching upto 1.1 Gbyte/s in-memory compression on a \
  quad core i7 \
* 64-bit file sizes and tested with terabyte sized archives containing \
  millions of files and directories \
* pipes and redirection and *nix-like behaviour for scripting and \
  flexibility \
* Adler32 checksums to ensure that decompressed data has not been corrupted \
* data recovery of damaged archives with 64 Kbyte grannularity"
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "qpress-1.1-9.12.aarch64.rpm"
RPM_HASH = "8ddeee3f309f0e47654bb172f8c4b48034bff29a67db41ceb57c39c008440de6b9567e6d5e3915cab600728a9b09a33026391f5c904c81afae7e282d1c6c76f7"

RPROVIDES:${PN} += "qpress"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
