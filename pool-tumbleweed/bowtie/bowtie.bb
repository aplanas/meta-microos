SUMMARY = "Fast and memory-efficient short read aligner"
DESCRIPTION = "Bowtie is an ultrafast, memory-efficient short read aligner. It aligns short \
DNA sequences (reads) to the human genome at a rate of over 25 million 35-bp \
reads per hour. Bowtie indexes the genome with a Burrows-Wheeler index to keep \
its memory footprint small: typically about 2.2 GB for the human genome \
(2.9 GB for paired-end)."
LICENSE = "Artistic-1.0"

PV = "1.3.1"

RPM_NAME = "bowtie-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "d2a34140091e9264ad49fe348ae93462a7be4d7740dcece108c1dc5ee6487d1d359034bb85c5a59f282e1b98917b9898a39861548af41c70469047c9f2f4d1d7"

RPROVIDES:${PN} += "bowtie"

RDEPENDS:${PN} += "/usr/bin/python3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
