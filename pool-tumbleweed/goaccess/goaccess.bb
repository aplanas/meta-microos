SUMMARY = "Apache Web Log Analyzer"
DESCRIPTION = "GoAccess is an Apache web log analyzer that provides HTTP statistics \
for system administrators that require a visual report on the fly."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "goaccess-1.7.2-1.2.aarch64.rpm"
RPM_HASH = "73ca65729677905f45f698bc912c1e59f782bc0a21f08115f79fa6c111aa5c9d2e966add21cf2511c8afc2b02b0680727d7a50e16b5ad758e35c7fe37bcbdf15"

RPROVIDES:${PN} += "config-goaccess \
goaccess"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
