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

RPM_NAME = "bgzip-1.16-1.4.aarch64.rpm"
RPM_HASH = "c13b3e939833f9d8e8f5e392f6ee0c85cb50719a4ca704c428d3b1d05884f6cb4724ae9fbc42ecea1154101450f3e351b4d511b626d3993167bc5da58f24d639"

RPROVIDES:${PN} += "bgzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhts3 \
libhtscodecs.so.2 \
libz.so.1 \
tabix"

inherit rpm
