SUMMARY = "LADSPA VCF plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins for audio EQ biquad filters."
LICENSE = "GPL-2.0"

PV = "0.0.5"

RPM_NAME = "ladspa-vcf-0.0.5-4.25.aarch64.rpm"
RPM_HASH = "789e422abc77bc95259817165aa70ad185479a54ffcb49fb69f900fd8dd7642090b739fbd0936cbd409eb6a5d86890784dc99ea499212360bf1b5f8d58d20777"

RPROVIDES:${PN} += "ladspa-vcf \
ladspa-vcf(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
