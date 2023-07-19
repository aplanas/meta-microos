SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-java-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "4161d00d9210d72ebfccbf9fa5ae93e8c0e0bda9688a5ff30c7db866ae9aef70cc32d997688a1a41de46c84fadf43f63217639cafbd284dbafdf5b9755aee823"

RPROVIDES:${PN} += "syslog-ng-java"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
