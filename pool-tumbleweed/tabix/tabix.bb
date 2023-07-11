SUMMARY = "Generic indexer for TAB-delimited genome position files from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "tabix-1.16-1.4.aarch64.rpm"
RPM_HASH = "6795cc64bbd40eac1e9bc24c276d85ebfccbb91e110253efda08e32f784a9b2071a660f9945c9dd6e354d3211ea1682fa702d47f486d4174eae6d5b66d711214"

RPROVIDES:${PN} += "tabix"

RDEPENDS:${PN} += "bgzip \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libhts3 \
libhtscodecs.so.2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
