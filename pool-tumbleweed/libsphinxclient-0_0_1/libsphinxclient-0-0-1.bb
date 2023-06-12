SUMMARY = "Pure C searchd client API library"
DESCRIPTION = "Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-0_0_1-2.2.11-7.7.aarch64.rpm"
RPM_HASH = "1cdd81f1e5e99e19f6e9ef5603374bf4d39a6ae1862d62c64c231e09812c823d6bc5cfbc14bbb4afca35c1888e535d56ee871ba9d876b5efc91a20ca4aab12a8"

RPROVIDES:${PN} += "libsphinxclient-0.0.1.so()(64bit) \
libsphinxclient-0_0_1 \
libsphinxclient-0_0_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
