SUMMARY = "Apache Web Log Analyzer"
DESCRIPTION = "GoAccess is an Apache web log analyzer that provides HTTP statistics \
for system administrators that require a visual report on the fly."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "goaccess-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "606089e8fc35c85df6fb15ad7be9d216610d4a538d4e628006f5f55da08706fa02aa5c4306c27a1f2a5708739adf7fde637606f5925a85bb2693bc67f4bd8b2e"

RPROVIDES:${PN} += "config-goaccess \
goaccess"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
