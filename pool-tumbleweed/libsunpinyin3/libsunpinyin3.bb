SUMMARY = "Libraries for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "libsunpinyin3-2.0.99.2-2.3.aarch64.rpm"
RPM_HASH = "8de6db7609ddea7976ae40fdb408d9a7ad24100066a08dffe323d05c28194e2f0d598791c963cc75085e05bae06e4fc9900b72158fbe1b949a378baf4b6d106f"

RPROVIDES:${PN} += "libsunpinyin.so.3 \
libsunpinyin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
sunpinyin-data"

inherit rpm
