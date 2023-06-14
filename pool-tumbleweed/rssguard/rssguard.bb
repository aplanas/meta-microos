SUMMARY = "RSS/ATOM/RDF feed reader"
DESCRIPTION = "RSS Guard is a RSS/ATOM feed aggregator developed using the Qt framework. \
It supports online feed synchronization."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only"

PV = "4.3.4"

RPM_NAME = "rssguard-4.3.4-1.1.aarch64.rpm"
RPM_HASH = "d925ea42ebeaac35f691ea51e8be0962f8c42c3bcef841e789cc956cb8e286712b9a81d38fa97a213314ca69fa788df41a9bf777ec1181367a6834bd34de8854"

RPROVIDES:${PN} += "rssguard \
rssguard-lang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
librssguard-4.3.4.so \
libstdc++.so.6"

inherit rpm
