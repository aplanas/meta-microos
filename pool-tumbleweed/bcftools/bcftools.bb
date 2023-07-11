SUMMARY = "Tools for manipulating variant calls in the Variant Call Format (VCF)"
DESCRIPTION = "Package for the new BCFtools: a set of utilities that manipulate variant calls in the Variant Call Format (VCF) \
and its binary counterpart BCF. It contains all the 'vcf...' commands which previously lived in the HTSlib \
repository (such as vcfcheck, vcfmerge, vcfisec, etc.) and the samtools BCF calling from bcftools subdirectory \
of samtools. BCFtools are meant as a faster replacement for most of the perl VCFtools commands."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "bcftools-1.16-1.4.aarch64.rpm"
RPM_HASH = "dea7c3d9355d911998cf220a555470ec883dafde958e2c9805023af02cdf75a994a801edeaed2d1d3f76d3c53fd4ab9558ae8839788204f1749c66c57e90bfa1"

RPROVIDES:${PN} += "bcftools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
bgzip \
htsfile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhts.so.3 \
libm.so.6 \
perl \
python3-base \
python3-matplotlib \
tabix"

inherit rpm
