SUMMARY = "Pure C searchd client API library"
DESCRIPTION = "Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-0_0_1-2.2.11-7.8.aarch64.rpm"
RPM_HASH = "af21d293a984b9478d940c05624213ef9dc2820703ecffbfb992bbae78ab4e40dcb750e0bfeae16f688d7f447476a330d796c899f1b24262d21c386d532f234a"

RPROVIDES:${PN} += "libsphinxclient-0-0-1 \
libsphinxclient-0.0.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
