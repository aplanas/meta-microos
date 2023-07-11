SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-python-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "e88edee1241af533e715962b93ff72c41e99dceebce44dcf82203d204d811f492ed32ffbba9e876ebb4ebbe93527d5ebd0ee84042687ea5face8950811c320be"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
