SUMMARY = "Tools for manipulating next-generation sequencing data"
DESCRIPTION = "Samtools implements various utilities for post-processing alignments in the \
SAM, BAM, and CRAM formats, including indexing, variant calling (in conjunction \
with bcftools), and a simple alignment viewer."
LICENSE = "MIT"

PV = "1.16.1"

RPM_NAME = "samtools-1.16.1-1.4.aarch64.rpm"
RPM_HASH = "f83078f7d540d374dcf424d1a66f5134e87a9ac8467d7102a277932aeef7a0505804455e0a8a656a6c37ba59f40eded590b6605aa268cf368fb8434645b0bf53"

RPROVIDES:${PN} += "samtools"

RDEPENDS:${PN} += "/usr/bin/perl \
bgzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhts.so.3 \
libhts3 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
perl \
tabix"

inherit rpm
