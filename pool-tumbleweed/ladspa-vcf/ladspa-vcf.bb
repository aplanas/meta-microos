SUMMARY = "LADSPA VCF plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins for audio EQ biquad filters."
LICENSE = "GPL-2.0"

PV = "0.0.5"

RPM_NAME = "ladspa-vcf-0.0.5-4.26.aarch64.rpm"
RPM_HASH = "c41d1226e37ccbeb79e69346d9097cc54162b39400ea9f692382997e1dd03dee2c8d5af01c4a7a5a8fc42e93cac89c321e88c0c3c90f98680cb1dffa89350fea"

RPROVIDES:${PN} += "ladspa-vcf"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
