SUMMARY = "C library for high-throughput sequencing data formats"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libhts3-1.16-1.3.aarch64.rpm"
RPM_HASH = "0eb915392d4fb5918c3ffc039434184a774ffc61e60618fa8a95f919102741822556d916b916219b43799e68e1ab408c82778cbada177fd916e569e88925968a"

RPROVIDES:${PN} += "libhts.so.3()(64bit) \
libhts3 \
libhts3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libhtscodecs.so.2()(64bit) \
libhtscodecs2 \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
