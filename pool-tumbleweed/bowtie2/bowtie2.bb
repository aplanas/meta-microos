SUMMARY = "Fast and memory-efficient short read aligner"
DESCRIPTION = "Bowtie 2 is an ultrafast and memory-efficient tool for aligning sequencing \
reads to long reference sequences. It is particularly good at aligning \
reads of about 50 up to 100s or 1,000s of characters, and particularly good \
at aligning to relatively long (e.g. mammalian) genomes. Bowtie 2 indexes \
the genome with an FM Index to keep its memory footprint small: for the \
human genome, its memory footprint is typically around 3.2 GB. Bowtie 2 \
supports gapped, local, and paired-end alignment modes."
LICENSE = "GPL-3.0-only"

PV = "2.5.1"

RPM_NAME = "bowtie2-2.5.1-1.4.aarch64.rpm"
RPM_HASH = "bff9789ddb9522a9604f568c79f306f9af82a8d51214e1da6f7e10f396e2243e45ad8822cab673ccd5534380f0442af53c835deab224b6167fe7f9dc5f39978c"

RPROVIDES:${PN} += "bowtie2"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
