SUMMARY = "Development libraries and header files for libsphinxclient"
DESCRIPTION = "Provides necessary development files for sphinx api and shared libs for sphinx client. \
Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-devel-2.2.11-7.7.aarch64.rpm"
RPM_HASH = "053534f20679b1da009fc1b87de1fc3e25a8af98d9f9fbd92682aa8b1fa2dfa1e0c95ba6daba6f08303a4b1eaa582f453c805489b975753691e78342b365c828"

RPROVIDES:${PN} += "libsphinxclient-devel"

RDEPENDS:${PN} += "libsphinxclient-0-0-1"

inherit rpm
