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

RPM_NAME = "acars-examples-1.3.1-1.17.aarch64.rpm"
RPM_HASH = "70d3970baeec8429b311b04f06679eb5c5c64dab2daf50a9527ce62ef20b9492e214cf5138499c9f5b25d5143d4da7ddf5e4914ce0b97fc3206d8c4a34e94d24"

RPROVIDES:${PN} += "acars-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars.so.1 \
libc.so.6"

inherit rpm
