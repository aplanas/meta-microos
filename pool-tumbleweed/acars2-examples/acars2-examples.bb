SUMMARY = "Example applications for libacars"
DESCRIPTION = "Example applications for for libacars: \
 \
 * decode_arinc.c - decodes ARINC-622 messages supplied at the \
   command line or from a file. \
 * adsc_get_position - illustrates how to extract position-related \
   fields from decoded ADS-C message. \
 * cpdlc_get_position - illustrates how to extract position-related \
   fields from CPDLC position reports. \
 * media_advisory - decodes Media Advisory messages (ACARS label SA \
   reports)"
LICENSE = "MIT"

PV = "2.1.4"

RPM_NAME = "acars2-examples-2.1.4-1.1.aarch64.rpm"
RPM_HASH = "2ec931048a66fedd878401fd68fc7c26a20d8c90bed81296274acdea0de2069362d64db884c8668ecaf6887c1f8bcf287e21278ad31ca0170a444091bbdfa533"

RPROVIDES:${PN} += "acars2-examples \
acars2-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libacars-2.so.2()(64bit) \
libc.so.6()(64bit)"

inherit rpm
