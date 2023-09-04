SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-java-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "d5104e4f497bff20d50548eb33275099af690ebeedbabc6f22689c100caa46fce51df3a7a8ffcfed9faf589cbbf27cd5e1da420f67d31a36eb40fbf8f6ee33b0"

RPROVIDES:${PN} += "syslog-ng-java"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
