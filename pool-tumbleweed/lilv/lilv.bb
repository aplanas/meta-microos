SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "lilv-0.24.20-2.1.aarch64.rpm"
RPM_HASH = "3a5f8533005a5f2bbec6299f53ce4e648e3be35f0156aa3e8d7d1bbb5490b31e440641169723ba64aac646b168e785ebedbaf4a281f0e4d9843750ec1e732b5e"

RPROVIDES:${PN} += "lilv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblilv-0-0 \
liblilv-0.so.0 \
libsndfile.so.1"

inherit rpm
