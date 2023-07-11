SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "lilv-0.24.20-1.2.aarch64.rpm"
RPM_HASH = "e5dc909cf485398f73f9c374442aa4e75f85584754757a67ef2471105df7ef3d751ab5bf46880b4b3166e2e189de883b305822f59e7694647c381adcdec7c0a2"

RPROVIDES:${PN} += "lilv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblilv-0-0 \
liblilv-0.so.0 \
libsndfile.so.1"

inherit rpm
