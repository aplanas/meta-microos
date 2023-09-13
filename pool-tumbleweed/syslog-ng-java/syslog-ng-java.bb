SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-java-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "ddd2567f6a7b0f63171036f522334d10cac45bf27da5e429059037b80b386369e3631d3e15d8cbb458e63e1f3ac8bf5cd0c37fdc5adc298b239487a7112c0179"

RPROVIDES:${PN} += "syslog-ng-java"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
