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

PV = "2.2.0"

RPM_NAME = "acars2-examples-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "cbde1e1804608851a1459389430cf5c8e8815da0a4190a0909c901453aa9bf1ed393052b3fe5c573443eb742688f91d3f896c99ca9d4b5b6d7d4cd089df4b5c1"

RPROVIDES:${PN} += "acars2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars-2.so.2 \
libc.so.6"

inherit rpm
