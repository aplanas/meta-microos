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

PV = "2.1.3"

RPM_NAME = "acars2-examples-2.1.3-1.10.aarch64.rpm"
RPM_HASH = "cc2fe1d5da6b51b9c2b837d7bd5da8ff9420c52e60a35fee764df1d6fc2161b23a0cf55f53e79fc438edd85feaa3e8491e779096c875a9db98720ae7b2a2b83b"

RPROVIDES:${PN} += "acars2-examples acars2-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacars-2.so.2()(64bit) libacars-2.so.2(ACARS_2.0)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
