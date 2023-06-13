SUMMARY = "Fast and memory-efficient short read aligner"
DESCRIPTION = "Bowtie is an ultrafast, memory-efficient short read aligner. It aligns short \
DNA sequences (reads) to the human genome at a rate of over 25 million 35-bp \
reads per hour. Bowtie indexes the genome with a Burrows-Wheeler index to keep \
its memory footprint small: typically about 2.2 GB for the human genome \
(2.9 GB for paired-end)."
LICENSE = "Artistic-1.0"

PV = "1.3.1"

RPM_NAME = "bowtie-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "55d4cc90b9a2d80d7996b8076ac944e6fcdcefc5c955fe8ed3aca71cd82f3f6f98646900b824344b5f38d67b61036170112b29e97a85900ceacecf25961abfa2"

RPROVIDES:${PN} += "bowtie \
bowtie(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
