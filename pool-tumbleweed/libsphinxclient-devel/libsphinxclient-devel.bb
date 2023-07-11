SUMMARY = "Development libraries and header files for libsphinxclient"
DESCRIPTION = "Provides necessary development files for sphinx api and shared libs for sphinx client. \
Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-devel-2.2.11-7.8.aarch64.rpm"
RPM_HASH = "473b18e2798c6464cc305f407b713e8caff5a0d43132d0adc2add7a6c22a5fc6f72463e1a9b2840b39d3f0e2cbf6eb970ce28c2f209e2f1097d4ca31f6e53e71"

RPROVIDES:${PN} += "libsphinxclient-devel"

RDEPENDS:${PN} += "libsphinxclient-0-0-1"

inherit rpm
