SUMMARY = "Tools for manipulating variant calls in the Variant Call Format (VCF)"
DESCRIPTION = "Package for the new BCFtools: a set of utilities that manipulate variant calls in the Variant Call Format (VCF) \
and its binary counterpart BCF. It contains all the 'vcf...' commands which previously lived in the HTSlib \
repository (such as vcfcheck, vcfmerge, vcfisec, etc.) and the samtools BCF calling from bcftools subdirectory \
of samtools. BCFtools are meant as a faster replacement for most of the perl VCFtools commands."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "bcftools-1.16-1.3.aarch64.rpm"
RPM_HASH = "e5d1bad044ae7c855beae57babebc47e399845a108a0a105f1c4d3f255583c6f893447e4381c8c88f0554bac1fc8dc07515e135057c04867ca7655c1c1b6aeb4"

RPROVIDES:${PN} += "bcftools \
bcftools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
bgzip \
htsfile \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhts.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
perl \
python3-base \
python3-matplotlib \
tabix"

inherit rpm
