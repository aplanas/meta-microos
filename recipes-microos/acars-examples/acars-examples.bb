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

PV = "1.3.1"

RPM_NAME = "acars-examples-1.3.1-1.16.aarch64.rpm"
RPM_HASH = "fc84815dad8a1753bba5245f0cf12daffa6bef3e24ac2c68b612fd046aacaecf1a2c54aaf4780822aacc3be99701b40aea1d0f6a0285bdfa3cd111ba6a30db22"

RPROVIDES:${PN} += "acars-examples acars-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacars.so.1()(64bit) libacars.so.1(ACARS_1.0)(64bit) libacars.so.1(ACARS_1.1)(64bit) libacars.so.1(ACARS_1.3)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
