SUMMARY = "C library for high-throughput sequencing data formats"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libhts3-1.16-1.4.aarch64.rpm"
RPM_HASH = "db32f4b8f585359a67ceae827025eb616ae566fd58b0a0e5313e927bee6646c2776cec6838809a784ac1f1ff2db430fc3703c367281e6afd5fc914323c66a7f9"

RPROVIDES:${PN} += "libhts.so.3 \
libhts3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libhtscodecs.so.2 \
libhtscodecs2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
