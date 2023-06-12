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

RPM_NAME = "bowtie2-2.5.1-1.3.aarch64.rpm"
RPM_HASH = "4cdf50da7f56b1247aa0426d56a0ae17a603fa75d985eed04e94e5daf3c9d20f8f040ac0e52bb69318b5b748cacf4f85d8dcdd6f188b6584385d70b737993331"

RPROVIDES:${PN} += "bowtie2 \
bowtie2(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit)"

inherit rpm
