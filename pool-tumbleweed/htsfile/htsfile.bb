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

RPM_NAME = "htsfile-1.16-1.3.aarch64.rpm"
RPM_HASH = "bdf74363f97dcbf3260bf07447ed7fd3f57a5445c4db0de16479aab484e39bdc042bded3ac733ffcfde81d6fc0021c96e86f48f35129f2012df5ea89df48736d"

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
