SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "lilv-0.24.20-1.1.aarch64.rpm"
RPM_HASH = "c01ac5c16bc2271727c31c6fffcee8fa58f21e1d31c5f5297bbc32e2cc4303b558ba7b062d6aab974f831b50b9fa34d7295ccb9200840c225830b70e26e30fc7"

RPROVIDES:${PN} += "lilv \
lilv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblilv-0-0 \
liblilv-0.so.0()(64bit) \
libsndfile.so.1()(64bit)"

inherit rpm
