SUMMARY = "Identify high-throughput sequencing data files from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "htsfile-1.16-1.4.aarch64.rpm"
RPM_HASH = "201e18e139f80c08d289c0a64a8f0089e2e214a3f71955edd282fc22d83f3da98a6cebca8b22f633efe426586c46d499ede7f37e465cd9c12ac5d8c935b72e39"

RPROVIDES:${PN} += "htsfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libhts3 \
libhtscodecs.so.2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
