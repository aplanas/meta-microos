SUMMARY = "ACARS SDR decoder"
DESCRIPTION = "A multi-channels acars decoder with built-in rtl_sdr front end. \
It comes with a database backend : acarsserv to store receved acars messages."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "acarsdec-3.7-1.3.aarch64.rpm"
RPM_HASH = "fcee6fa2fe1f6d0099e7683b40e0089b5b0b39e6f61fcca3889e7cfb4b3a54490b6b1cda55a3d5ca21e3af06609f500e821755f35b0926e6635ca710f626a283"

RPROVIDES:${PN} += "acarsdec \
bundled-cJSON"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars-2.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
