SUMMARY = "Block compression/decompression utility from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "bgzip-1.16-1.3.aarch64.rpm"
RPM_HASH = "5d5451fef0e9e32e5afb849151a1bebb48761303f0f1c7f7a8edf9361eb75b385286eb084475ae414142d119c7103c7616b4752dd94194164aa17a3cf234c970"

RPROVIDES:${PN} += "bgzip \
bgzip(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libhts3 \
libhtscodecs.so.2()(64bit) \
libz.so.1()(64bit) \
tabix"

inherit rpm
