SUMMARY = "Data files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides data files needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-data-2.0.99.2-2.3.aarch64.rpm"
RPM_HASH = "dbce1da199abf2168eafc7d88960ec787e789b6fa23b6ba113be2f5811b1fba6c39c9ba8995791be64d56d45104352583caa65aa74609163835b21230b83bb80"

RPROVIDES:${PN} += "sunpinyin-data"

RDEPENDS:${PN} += ""

inherit rpm
