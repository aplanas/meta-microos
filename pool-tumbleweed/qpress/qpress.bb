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

RPM_NAME = "qpress-1.1-9.13.aarch64.rpm"
RPM_HASH = "2f2bc6b3f150d47118701e0110712eee3ed61d8cf9cf4fa561b4e1ca8f7ab9b28b4ead16b724e7a44f62b23ab1b846ee8a54d5b96cc70f2ef8d5f489ced16bc3"

RPROVIDES:${PN} += "qpress"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
